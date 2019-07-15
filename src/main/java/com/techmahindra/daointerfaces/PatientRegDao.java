package com.techmahindra.daointerfaces;

import java.sql.SQLException;

import com.techmahindra.beans.PatientRegBean;

public interface PatientRegDao
{
	public void patDetails(PatientRegBean patregbean ) 
			throws ClassNotFoundException, SQLException;

}
