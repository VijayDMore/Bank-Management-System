package com.jsp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/home")
public class HomeController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Customer=req.getParameter("customer");
		String Manager=req.getParameter("manager");
		String Admin=req.getParameter("admin");
		
		if(Customer!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Customer.jsp");
			
			requestDispatcher.forward(req, resp);
		}
		
		
		if(Manager!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Manager.jsp");
			
			requestDispatcher.forward(req, resp);
		}
		
		if(Admin!=null) {
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("Admin.jsp");
			
			requestDispatcher.forward(req, resp);
		}
		
	}
}
