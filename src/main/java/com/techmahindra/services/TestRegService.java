package com.techmahindra.services;

import java.sql.SQLException;

import com.techmahindra.beans.TestRegBean;
import com.techmahindra.daofactory.DaoFactory;
import com.techmahindra.daointerfaces.TestRegDao;

public class TestRegService 
{
	public void insertDetails(TestRegBean testregbean ) 
			throws ClassNotFoundException, SQLException

	{
		TestRegDao trd=DaoFactory.getTestRegDao();
		System.out.println("hi");
		trd.insertDetails( testregbean );
	}
}
