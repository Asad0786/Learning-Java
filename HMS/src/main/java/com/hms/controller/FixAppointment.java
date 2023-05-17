package com.hms.controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hms.model.LoginImpl;
import com.hms.model.LoginServicesModel;

/**
 * Servlet implementation class FixAppointment
 */
@WebServlet("/fixAppointment")
public class FixAppointment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FixAppointment() {
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

		HttpSession session = request.getSession(false);
		if (session.getAttribute("userData") != null) {
			String pEmail = request.getParameter("patEmail");
			String dEmail = request.getParameter("docEmail");
			String aDate = request.getParameter("appDate");
			String disease = request.getParameter("disease");
			System.out.println(aDate);
			LoginServicesModel lsm = new LoginImpl();
			ResultSet rs = lsm.fetchRecordByEmail("patient", pEmail);
//			try {
//				if(rs.next())
//					System.out.println(rs.getString(1));
//				else
//					System.out.println("null");
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

			ResultSet ds = lsm.fetchRecordByEmail("doctor", dEmail);
			int pid = 0;
			int did = 0;
			try {
				if (rs.next())
					pid = Integer.parseInt(rs.getString(1));
				if (ds.next())
					did = Integer.parseInt(ds.getString(1));

			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			System.out.println(pid + " " + did);
			int sta = lsm.bookAppointment(pid, did, aDate, disease);
			if (sta > 0) {
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/reception_view/home.jsp");
				rd.forward(request, response);
			} else
				System.out.println("Some error");

		}

	}

}
