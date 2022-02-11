package web.serve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.javaguides.hibernate.*;

@WebServlet(name = "RegisterServlet", description = "Servlet with Annotation", urlPatterns = { "/RegisterServlet",
		"/RegisterServlet" })
/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServlet() {
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
		request.getParameter("username");
		request.getParameter("email");
		request.getParameter("password");

		try {
			// create crud instance
			CRUDOperations crudOperations = new CRUDOperations();
			// insert user
			crudOperations.insertEntity(request.getParameter("username"), request.getParameter("email"),
					request.getParameter("password"));
			response.sendRedirect("profile.jsp");

		} catch (Exception e) {
			// TODO: handle exception
			response.sendRedirect("signup.jsp");
		}

		doGet(request, response);
	}

}
