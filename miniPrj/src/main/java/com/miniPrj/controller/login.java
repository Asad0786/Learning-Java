package com.miniPrj.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.miniPrj.model.DAOService;
import com.miniPrj.model.DOAImplementation;

@WebServlet("/verifyLogin")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public login() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("userEmail");
		String password = request.getParameter("userPass");
		DAOService service = new DOAImplementation();
		service.connectDB();
		boolean status = service.verifyUser(email, password);
		System.out.println(status);
		if (status) {
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/registration.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("result", "Wrong Credentials");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}

	}

}
