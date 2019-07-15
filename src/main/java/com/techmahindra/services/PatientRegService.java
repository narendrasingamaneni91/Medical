package com.techmahindra.services;

import java.sql.SQLException;

import com.techmahindra.beans.PatientRegBean;
import com.techmahindra.daofactory.DaoFactory;
import com.techmahindra.daoimplementations.PatientRegDaoImplementation;
import com.techmahindra.daointerfaces.PatientRegDao;

public class PatientRegService
{
	public void patDetails(PatientRegBean patregbean ) 
			throws ClassNotFoundException, SQLException
			{
		System.out.println("In the service");
		PatientRegDao prd=DaoFactory.getPatientRegDao();
				prd.patDetails(patregbean);
			}
}
