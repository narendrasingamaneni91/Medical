package com.techmahindra.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.beans.PatientRegBean;
import com.techmahindra.beans.ReportBean;
import com.techmahindra.daofactory.DaoFactory;
import com.techmahindra.daointerfaces.LoginDao;
import com.techmahindra.daointerfaces.ReportDao;

public class ReportService 
{

	public ResultSet reportDetails( ReportBean bean) throws ClassNotFoundException, SQLException{
		ReportDao ld = DaoFactory.getReportDao();
		return ld.reportDetails(bean);
	}		
}
