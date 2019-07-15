package com.techmahindra.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techmahindra.beans.PaymentBean;
import com.techmahindra.services.PaymentService;
import com.techmahindra.servicesfactory.ServicesFactory;

/**
 * Servlet implementation class PaymentController
 */
@WebServlet("/PaymentController")
public class PaymentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=ISO-8859-1");
		PrintWriter out=response.getWriter();
		try
		{
			String pname=request.getParameter("username");
			int pid = Integer.parseInt(request.getParameter("patient_id"));
			int tid = Integer.parseInt(request.getParameter("test_id"));
			int amt = Integer.parseInt(request.getParameter("amount"));
			PaymentBean pb = new PaymentBean();
			pb.setUsername(pname);
			pb.setPatient_id(pid);
			pb.setTest_id(tid);
			pb.setAmount(amt);
			PaymentService ps = ServicesFactory.getPaymentService();
			try {
				ps.paymentDetails(pb);
			} 
			catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			RequestDispatcher rd=request.getRequestDispatcher("paymentdetails.jsp");
			rd.forward(request, response);
			
		}
		catch(SQLException e)
		{
			RequestDispatcher rd1=request.getRequestDispatcher("paymentredirect.jsp");
			rd1.forward(request, response);
		}
		catch(Exception e){
			RequestDispatcher rd1=request.getRequestDispatcher("paymentredirect.jsp");
			rd1.forward(request, response);
		}
		
		
	}
}
