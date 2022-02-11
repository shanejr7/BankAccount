package web.serve;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.hibernate.CRUDOperations;

@WebServlet(name = "LoginServlet", description = "Servlet with Annotation", urlPatterns = { "/LoginServlet",
		"/LoginServlet" })
/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		request.getParameter("email");
		request.getParameter("password");

		try {
			// create crud instance
			CRUDOperations crudOperations = new CRUDOperations();

			// find user
			boolean auth = crudOperations.findEntity(request.getParameter("email"), request.getParameter("password"));

			// redirect user to pages

			if (auth) {
				response.sendRedirect("profile.jsp");
			} else {
				response.sendRedirect("login.jsp");
			}

		} catch (Exception e) {

			response.sendRedirect("login.jsp");
		}

		doGet(request, response);
	}

}
