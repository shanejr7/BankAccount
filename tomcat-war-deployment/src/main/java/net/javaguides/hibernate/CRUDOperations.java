package net.javaguides.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import net.javaguides.hibernate.entity.User;
import net.javaguides.hibernate.util.JPAUtil;

/**
 * JPA CRUD Operations
 *
 */
public class CRUDOperations {

	public void insertEntity(String username, String email, String password) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		User user = new User(username, email, password);
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	@SuppressWarnings("unused")
	public boolean findEntity(String email, String password) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		Query user = entityManager.createNativeQuery(
				"SELECT * FROM HCL.User where email = :email and password = :password");
		
		user.setParameter("email", email);
		user.setParameter("password", password);
		user.getSingleResult();

		System.out.println(user.getResultList());
		entityManager.getTransaction().commit();
		entityManager.close();

		if (user != null) {
			return true;
		} else
			return false;
	}

	public void findEntity(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		User user = entityManager.find(User.class, id);
		System.out.println("user id :: " + user.getId());
		System.out.println("username :: " + user.getUserName());
		System.out.println("user email :: " + user.getEmail());
		System.out.println("user email :: " + user.getPassword());
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void updateEntity(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		User user = entityManager.find(User.class, id);
		System.out.println("user id :: " + user.getId());
		System.out.println("username :: " + user.getUserName());
		System.out.println("user email :: " + user.getEmail());
		System.out.println("user email :: " + user.getPassword());

		// The entity object is physically updated in the database when the transaction
		// is committed
		user.setUserName("Manny");
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void removeEntity(int id) {
		EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		User user = entityManager.find(User.class, id);
		System.out.println("user id :: " + user.getId());
		System.out.println("username :: " + user.getUserName());
		System.out.println("user email :: " + user.getEmail());
		System.out.println("user email :: " + user.getPassword());
		entityManager.remove(user);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}