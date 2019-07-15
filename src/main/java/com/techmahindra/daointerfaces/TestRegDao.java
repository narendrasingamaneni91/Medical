package com.techmahindra.daointerfaces;

import java.sql.SQLException;

import com.techmahindra.beans.TestRegBean;

public interface TestRegDao
{
	public void insertDetails(TestRegBean testregbean ) 
			throws ClassNotFoundException, SQLException;
}
