package com.miniPrj.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.miniPrj.model.DAOService;
import com.miniPrj.model.DOAImplementation;

@WebServlet("/saveReg")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("userName");
		int age = Integer.parseInt(request.getParameter("userAge"));
		String parentAge = request.getParameter("parentAge");
		String email = request.getParameter("userEmail");
		DAOService service = new DOAImplementation();
		service.connectDB();
		int status = service.addNewUser(name, age, parentAge, email);

		if (status != 0)
			System.out.println(status);
		else
			System.out.println("Some error!");


	}

}
