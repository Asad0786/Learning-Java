package com.hms.controller;

import java.io.IOException;

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
 * Servlet implementation class DeReg
 */
@WebServlet("/deReg")
public class DeReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session.getAttribute("userData") != null) {
			Integer id = Integer.parseInt(  request.getParameter("id"));
			boolean st = Boolean.parseBoolean(request.getParameter("st"));
			LoginServicesModel lsm = new LoginImpl();
			int changeSatus = lsm.changeSatus("doctor", id, st);
			if(changeSatus>0) {
				RequestDispatcher rd = request.getRequestDispatcher("deRegDoc");
				rd.forward(request, response);
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
