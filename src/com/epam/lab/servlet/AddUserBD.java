package com.epam.lab.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.lab.model.UserModel;
import com.epam.lab.service.UserService;

/**
 * Servlet implementation class AddUser
 */
@WebServlet("/userBDa")
public class AddUserBD extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddUserBD() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println(1111);
		UserModel u = new UserModel();
		if (isNull("login", req) && isNull("password", req)
				&& isNull("firstname", req) && isNull("lastname", req)
				&& isInt(req.getParameter("age"))
				&& isNull("gender", req)) {
			u.setLogin(req.getParameter("login"));
			u.setPassword(req.getParameter("password"));
			u.setFirstname(req.getParameter("firstname"));
			u.setLastname(req.getParameter("lastname"));
			u.setAge(Integer.parseInt(req.getParameter("age")));
			u.setGender(req.getParameter("gender"));
		

			UserService us = new UserService();
			System.out.println(u.toString());
			us.addUser(u);
			resp.sendRedirect("pages/AddUser.jsp");
			return;
		} else {
			resp.sendRedirect("pages/AddUser.jsp");
			return;
		}
		
		
	}

	private boolean isNull(String st, HttpServletRequest req) {
		return req.getParameter(st) != null;
	}

	private boolean isInt(String st) {
		try {
			Integer.parseInt(st);
		} catch (NumberFormatException | NullPointerException e) {
			return false;
		}
		return true;
	}

}
