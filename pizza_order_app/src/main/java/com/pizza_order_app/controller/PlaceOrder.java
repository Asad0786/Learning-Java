package com.pizza_order_app.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pizza_order_app.model.PDImple;
import com.pizza_order_app.model.PDServices;

@WebServlet("/orderConfirm")
public class PlaceOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PlaceOrder() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("custName");
		long phone = Long.parseLong(request.getParameter("custPhone"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		PDServices service = new PDImple();
		service.connectDB();
		int status = service.bookPizza(name, pid, phone);
		if(status >0)
		{
			System.out.println("yes");
			request.setAttribute("stats", status);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/OrderConfirmation.jsp");
			rd.forward(request, response);
		}
		

	}

}
