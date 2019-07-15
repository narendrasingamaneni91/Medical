package com.techmahindra.daofactory;

import com.techmahindra.daoimplementations.AdminDaoImplementation;
import com.techmahindra.daoimplementations.LoginDaoImplementation;
import com.techmahindra.daoimplementations.PatientRegDaoImplementation;
import com.techmahindra.daoimplementations.PaymentDaoImplementation;
import com.techmahindra.daoimplementations.ReportDaoImplementation;
import com.techmahindra.daoimplementations.TestRegDaoImplementation;
import com.techmahindra.daointerfaces.AdminDao;
import com.techmahindra.daointerfaces.LoginDao;
import com.techmahindra.daointerfaces.PatientRegDao;
import com.techmahindra.daointerfaces.PaymentDao;
import com.techmahindra.daointerfaces.ReportDao;
import com.techmahindra.daointerfaces.TestRegDao;

public class DaoFactory
{
	private static LoginDao ldao = null;
	private static PatientRegDao prdao = null;
	private static TestRegDao trdao = null;
	private static PaymentDao pdao = null;
	private static AdminDao adao = null;
	private static ReportDao rdao = null;
	
	public static LoginDao getLoginDao( ){
        if(ldao==null){
        	ldao=new LoginDaoImplementation( );

        }
        else{
            return ldao;
        }
        return ldao;
    }
	public static PatientRegDao getPatientRegDao(){
		if(prdao==null){
			prdao = new PatientRegDaoImplementation();
			
			System.out.println("In the daofactory");
		}
		else
		{
			return prdao;
		}
		return prdao;
	}
	
	public static TestRegDao getTestRegDao(){
		if(trdao==null)
		{
			trdao = new TestRegDaoImplementation();
			
		}
		else
		{
			return trdao;
		}
		return trdao;
	}
	public static PaymentDao getPaymentDao(){
		if(pdao==null)
		{
			pdao = new PaymentDaoImplementation();
			
		}
		else
		{
			return pdao;
		}
		return pdao;
	
}
	public static AdminDao getAdminDao(){
		if(adao==null)
		{
			adao = new AdminDaoImplementation();
			
		}
		else
		{
			return adao;
		}
		return adao;
	
}
	public static ReportDao getReportDao(){
		if(rdao==null)
		{
			rdao = new ReportDaoImplementation();
			
		}
		else
		{
			return rdao;
		}
		return rdao;
	
}
}
