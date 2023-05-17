package com.hms.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hms.model.PatientDAO;
import com.hms.model.PatientData;
import com.hms.model.PatientImpl;

/**
 * 
 * Servlet implementation class createPatient
 * 
 */

@WebServlet("/createPatient")
public class createPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public createPatient() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(300);
			if (session.getAttribute("userData") != null) {
				RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/reception_view/create.jsp");
				rd.forward(request, response);
			} else {
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			request.setAttribute("status", "Session timed out, login again");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			HttpSession session = request.getSession(false);
			session.setMaxInactiveInterval(300);
			if (session.getAttribute("userData") != null) {
				String name = (request.getParameter("patientFirstName") + " "
						+ request.getParameter("patientSecondName") + " " + request.getParameter("patientLastName"))
						.trim().replace("\\s", "");
				String dob = request.getParameter("patientDOB");
				String gender = request.getParameter("patientGender");
				String email = request.getParameter("patientEmail");
				String phone = request.getParameter("patientPhone");
				PatientData pd = new PatientData();
				pd.setName(name);
				pd.setDob(dob);
				pd.setEmail(email);
				pd.setPassword(email);
				pd.setGender(gender);
				pd.setContact(phone);
				PatientDAO pdo = new PatientImpl();
				int inserRecord = pdo.inserRecord(pd);
				if (inserRecord > 0) {
					RequestDispatcher rd = request.getRequestDispatcher("addAppointment");
					rd.forward(request, response);
				}

			} else {
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			request.setAttribute("status", "Session timed out, login again");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
		}
	}

}
