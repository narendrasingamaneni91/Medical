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

import com.techmahindra.beans.PatientRegBean;
import com.techmahindra.beans.ReportBean;
import com.techmahindra.services.LoginBeanService;
import com.techmahindra.services.ReportService;
import com.techmahindra.servicesfactory.ServicesFactory;

/**
 * Servlet implementation class ReportController
 */
@WebServlet("/ReportController")
public class ReportController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html; charset=ISO-8859-1");
		PrintWriter out=response.getWriter();
		ResultSet result=null;
		try
		{
			int pid=Integer.parseInt(request.getParameter("patient_id"));
			System.out.println(pid);
			int tid=Integer.parseInt(request.getParameter("test_id"));
		    ReportService rs=ServicesFactory.getReportService();
		    ReportBean pb=new ReportBean();
		    pb.setPatient_id(pid);
		    pb.setTest_id(tid);
			try
			{
				result=rs.reportDetails(pb);
				
			}
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
			}
		
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			    request.setAttribute("ResultSet", result);
				RequestDispatcher rd=request.getRequestDispatcher("ReportDelivered.jsp");
				rd.forward(request,response);
			
		}
		finally
		{
			out.close();
		}

	}

}
