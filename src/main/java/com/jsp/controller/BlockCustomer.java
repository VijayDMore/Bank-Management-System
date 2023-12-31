package com.jsp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.service.CustomerServices;
import com.jsp.service.ManagerServices;

@WebServlet("/blockCustomer")
public class BlockCustomer  extends HttpServlet{
	
	CustomerServices customerServices=new CustomerServices();
	ManagerServices managerServices=new ManagerServices();
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String customer_ID=req.getParameter("customerId");
		int id=Integer.parseInt(customer_ID);
		
		String manager_ID=req.getParameter("manager_ID");
		int id2=Integer.parseInt(manager_ID);
		
		Manager manager=managerServices.fetchManagerDetails(id2);
		Customer customer=customerServices.getCustomerByID(id);
		
		

	//======================================================================
		
		if(manager.getId()==customer.getManager().getId())
		{
			if(customer.getStatus().equals("Approve")) 
			{
			customer.setStatus("Block");
			
			customerServices.updateCustomer(customer);
			
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body><h1>"+" Customer is now Block! "+"</h1></body></html>");
			
			
			}else if(customer.getStatus().equals("Block"))  {
				 PrintWriter printWriter=resp.getWriter();
					printWriter.write("<html><body><h1>"+" Customer is already Blocked "+"</h1></body></html>");
			
			 }
		}else {
			PrintWriter printWriter=resp.getWriter();
			printWriter.write("<html><body><h1>"+manager.getName()+" you are not Authorized To Block "+customer.getId()+" customer"+"</h1></body></html>");
	
		}
		
	}

}
