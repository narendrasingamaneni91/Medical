package com.techmahindra.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.services.AdminBeanService;
import com.techmahindra.services.LoginBeanService;
import com.techmahindra.servicesfactory.ServicesFactory;

@WebServlet("/ViewPatientController")
public class ViewPatientController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		response.setContentType("text/html; charset=ISO-8859-1");
		PrintWriter out=response.getWriter();
		ResultSet rs=null;
	//	LoginBean lb=new LoginBean();
		AdminBeanService as=ServicesFactory.getAdminBeanService();
		try
		{
			rs=as.viewPatient();
		
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		request.setAttribute("ResultSet", rs);
		RequestDispatcher rd=request.getRequestDispatcher("viewpatient.jsp");
		rd.forward(request, response);
		
	}
	
	

}
