package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.*;

/**
 * Servlet implementation class LoginServlet
 */

@WebServlet("/login")
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

		boolean status = false;
		
		try {
			
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			User u1 = new User();
			u1.setUserName(username);
			u1.setEmail(email);

			request.setAttribute("userObject", u1);

			status = u1.validateUserPassword(password,username);
			
		}catch (Exception e) {
			// TODO: handle exception
			status = false;
		}
		

		if (status)
			request.getRequestDispatcher("success.jsp").forward(request, response);

		if (!status)
			request.getRequestDispatcher("failure.jsp").forward(request, response);

		doGet(request, response);
	}

}
