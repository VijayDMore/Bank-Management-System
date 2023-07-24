package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdminController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String Register = req.getParameter("register");
		String Login = req.getParameter("login");
		String Customer = req.getParameter("customer");
		String Manager = req.getParameter("manager");

		if (Register != null) {

			RequestDispatcher requestDispatcher = req.getRequestDispatcher("SignUp.jsp");

			requestDispatcher.forward(req, resp);
		}
		
		if (Login != null) {
            RequestDispatcher requestDispatcher=req.getRequestDispatcher("Login.jsp");
            
            requestDispatcher.forward(req, resp);
		}
		
		if(Customer!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("AllCustomer.jsp");
			
			requestDispatcher.forward(req, resp);
			
		}
		
		if(Manager!=null) {
			
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("AllManager.jsp");
			
			requestDispatcher.forward(req, resp);
			
			
			
			
		}
	}

}
