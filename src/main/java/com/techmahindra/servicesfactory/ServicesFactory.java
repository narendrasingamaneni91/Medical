package com.techmahindra.servicesfactory;

import com.techmahindra.services.AdminBeanService;
import com.techmahindra.services.LoginBeanService;
import com.techmahindra.services.PatientRegService;
import com.techmahindra.services.PaymentService;
import com.techmahindra.services.ReportService;
import com.techmahindra.services.TestRegService;

public class ServicesFactory 
{
	private static LoginBeanService lbs=null;
	private static PatientRegService prs=null;
	private static TestRegService trs=null;
	private static PaymentService ps=null;
	private static AdminBeanService as=null;
	private static ReportService rs=null;
	public static LoginBeanService getLoginBeanService()
	{
		if(lbs==null)
		{
			lbs=new LoginBeanService();
		}
		else
		{
			return lbs;
		}
		return lbs;
	}
	public static PatientRegService getPatientRegService()
	{
		
		System.out.println("In the service factory");
		if(prs==null)
		{
			prs=new PatientRegService();
		}
		else
		{
			return prs;
		}
		return prs;
	}
	public static TestRegService getTestRegService()
	{
		if(trs==null)
		{
			trs=new TestRegService();
		}
		else
		{
			return trs;
		}
		return trs;
	}
	public static PaymentService getPaymentService()
	{
		if(ps==null)
		{
			ps=new PaymentService();
		}
		else
		{
			return ps;
		}
		return ps;
	}
	public static AdminBeanService getAdminBeanService()
	{
		if(as==null)
		{
			as=new AdminBeanService();
		}
		else
		{
			return as;
		}
		return as;
	}
	public static ReportService getReportService()
	{
		if(rs==null)
		{
			rs=new ReportService();
		}
		else
		{
			return rs;
		}
		return rs;
	}

}
