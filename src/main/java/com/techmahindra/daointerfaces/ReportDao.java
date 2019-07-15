package com.techmahindra.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.techmahindra.beans.PatientRegBean;
import com.techmahindra.beans.ReportBean;

public interface ReportDao 
{
	public abstract ResultSet reportDetails(ReportBean bean ) 
			throws ClassNotFoundException, SQLException;
}
