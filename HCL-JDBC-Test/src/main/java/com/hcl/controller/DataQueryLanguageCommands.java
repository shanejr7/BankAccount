package com.hcl.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.hcl.jdbc.JDBC;
import com.hcl.model.Employee;

import java.util.Scanner;

public class DataQueryLanguageCommands extends Employee {

	Employee employee = new Employee();
	long findById;
	float salary;

	// insert employee
	public void insertEmployee(Scanner scan) {

		System.out.println("Insert new user\n");

		System.out.println("Enter id :\n");
		employee.setEmployeeId((long) scan.nextInt());

		System.out.println("Enter first name :\n");
		employee.setFirstName(scan.next());

		System.out.println("Enter last name :\n");
		employee.setLastName(scan.next());

		System.out.println("Enter dob :\n");
		employee.setDob(scan.next());

		System.out.println("Enter age :\n");
		employee.setAge(scan.nextInt());

		System.out.println("Enter salary :\n");
		employee.setSalary(scan.nextFloat());

		try {
			JDBC jdbc = new JDBC();

			Connection con = jdbc.connection();

			String sql = "INSERT INTO HCL.EMPLOYEE (id, fname, lname, dob, age, salary) VALUES (?,?,?,?,?,?)";

			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setLong(1, employee.getEmployeeId());
			preparedStatement.setString(2, employee.getFirstName());
			preparedStatement.setString(3, employee.getLastName());
			preparedStatement.setString(4, employee.getDob());
			preparedStatement.setInt(5, employee.getAge());
			preparedStatement.setFloat(6, (float) employee.getSalary());

			@SuppressWarnings("unused")
			int row = preparedStatement.executeUpdate();

			System.out.println("\nEmployee inserted into given database...");

			con.close();
			System.out.println("\nclosed JDBC connection..\n");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// insert employee
	public void updateEmployee(Scanner scan) {

		System.out.println("Enter employee id :\n");
		findById = (long) scan.nextInt();

		System.out.println("Enter employee new salary :\n");
		salary = (float) scan.nextDouble();

		try {
			JDBC jdbc = new JDBC();

			Connection con = jdbc.connection();

			String sql = "UPDATE HCL.EMPLOYEE SET salary = ? WHERE id = ?";

			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setFloat(1, salary);
			preparedStatement.setLong(2, findById);

			preparedStatement.executeUpdate();

			System.out.println("\nEmployee salary updated in given database...");

			con.close();
			System.out.println("\nclosed JDBC connection..\n");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// select all employees
	public void selectEmployee() {

		try {
			JDBC jdbc = new JDBC();

			Connection con = jdbc.connection();

			Statement stmt = con.createStatement();

			String sql = "SELECT * FROM HCL.EMPLOYEE";

			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				// Display values
				System.out.println("ID: " + rs.getLong("id"));
				System.out.println("first name: " + rs.getInt("age"));
				System.out.println("last name: " + rs.getString("fname"));
				System.out.println("dob: " + rs.getString("dob"));
				System.out.println("age: " + rs.getInt("age"));
				System.out.println("salary: " + rs.getFloat("salary") + "\n");

			}
			System.out.println("\nSelected all employees in database...");

			con.close();
			System.out.println("\nclosed JDBC connection..\n");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// select individual employee
	public void selectEmployee(Scanner scan, int id) {

		System.out.println("Enter employee id :\n");
		findById = (long) scan.nextInt();

		try {
			JDBC jdbc = new JDBC();

			Connection con = jdbc.connection();

			String sql = "SELECT * FROM HCL.EMPLOYEE WHERE id = ?";

			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setFloat(1, findById);

			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				// Display values
				System.out.println("ID: " + rs.getLong("id"));
				System.out.println("first name: " + rs.getInt("age"));
				System.out.println("last name: " + rs.getString("fname"));
				System.out.println("dob: " + rs.getString("dob"));
				System.out.println("age: " + rs.getInt("age"));
				System.out.println("salary: " + rs.getFloat("salary"));
			}
			System.out.println("\nSelected individual employee in database...");

			con.close();
			System.out.println("\nclosed JDBC connection..\n");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	// delete individual employee
	public void deleteEmployee(Scanner scan, int id) {

		System.out.println("Enter employee id :\n");
		findById = (long) scan.nextInt();

		try {
			JDBC jdbc = new JDBC();

			Connection con = jdbc.connection();

			String sql = "DELETE FROM HCL.EMPLOYEE WHERE id = ?";

			PreparedStatement preparedStatement = con.prepareStatement(sql);

			preparedStatement.setLong(1, findById);

			preparedStatement.executeUpdate();

			System.out.println("\nDeleted individual employee in database...");

			con.close();
			System.out.println("\nclosed JDBC connection..\n");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
