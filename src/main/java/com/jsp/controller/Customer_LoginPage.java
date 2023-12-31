package com.jsp.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerServices;

@WebServlet("/customerservices")
public class Customer_LoginPage extends HttpServlet {

	CustomerServices customerServices=new CustomerServices();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String CustomerID=req.getParameter("customerId");
		int id=Integer.parseInt(CustomerID);
		Customer customer=customerServices.getCustomerByID(id);
	}	
}
