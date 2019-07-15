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
import javax.servlet.http.HttpSession;

import com.techmahindra.beans.PatientRegBean;
import com.techmahindra.services.PatientRegService;
import com.techmahindra.servicesfactory.ServicesFactory;

/**
 * Servlet implementation class PatientRegController
 */
@SuppressWarnings("serial")
@WebServlet("/PatientRegController")
public class PatientRegController extends HttpServlet
{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html; charset=ISO-8859-1");
		PrintWriter ou=response.getWriter();
		try
		{
			
			System.out.println("In the controller");
			
			int pid = Integer.parseInt(request.getParameter("patient_id"));
					
			String pname = request.getParameter("patient_name");
			String password=request.getParameter("password");
			int age = Integer.parseInt(request.getParameter("age"));
			String g = request.getParameter("gender");
			String phn=request.getParameter("phoneno");
			String docname=request.getParameter("doctorname");
			String appointmentDate = request.getParameter("appointmentDate");
			String appointmentTime = request.getParameter("appointmentTime");
			PatientRegBean prb = new PatientRegBean();
			
			HttpSession hs = request.getSession();
			hs.setAttribute("id", pid);
			hs.setAttribute("n", pname);
			
			prb.setPatient_id(pid);
			prb.setUsername(pname);
			prb.setPassword(password);
			prb.setAge(age);
			prb.setGender(g);
			prb.setPhoneno(phn);
			prb.setDoctorName(docname);
			prb.setAppointmentDate(appointmentDate);
			prb.setAppointmentTime(appointmentTime);
			
			System.out.println("conmmm");
			
			
		
			PatientRegService prs1 = ServicesFactory.getPatientRegService();
			System.out.println("secnd");
			try {
				prs1.patDetails(prb);
				System.out.println("hello");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
							}
			RequestDispatcher rd=request.getRequestDispatcher("viewtests.jsp");
			rd.forward(request, response);
			
			
			
		
//		else{
//			RequestDispatcher rd=request.getRequestDispatcher("patientregredirect.jsp");
//		rd.forward(request, response);
//		}
		
		
		}
		catch(SQLException e)
		{
			//RequestDispatcher rd=request.getRequestDispatcher("patientregredirect.jsp");
			//rd.forward(request, response);
		}
		catch(Exception e){
			request.setAttribute("msg","Invalid details");
			RequestDispatcher rd=request.getRequestDispatcher("pat_reg.jsp");
		rd.forward(request, response);
		}
		
			
	}			
}
