package com.pizza_order_app.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pizza_order_app.model.PDImple;
import com.pizza_order_app.model.PDServices;

/**
 * Servlet implementation class CheckOrder
 */
@WebServlet("/CheckOrder")
public class CheckOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CheckOrder() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/getDeatails.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int orderID = Integer.parseInt(request.getParameter("order"));
		PDServices ps = new PDImple();
		ps.connectDB();
		try {
			ResultSet rs = ps.fetchOrders(orderID);
			if(rs.next()) {			
		
				request.setAttribute("Name", rs.getString(1));
				request.setAttribute("PizzaStyle", rs.getString(2));
				request.setAttribute("price", rs.getString(3));
				request.setAttribute("phone", rs.getString(4));
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/displayDetails.jsp");
				rd.forward(request, response);

			}
			else
			{	request.setAttribute("name", "null");
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/getDeatails.jsp");
				rd.forward(request, response);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
