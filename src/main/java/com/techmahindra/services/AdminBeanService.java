package com.techmahindra.services;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.daofactory.DaoFactory;
import com.techmahindra.daointerfaces.AdminDao;
import com.techmahindra.daointerfaces.LoginDao;

public class AdminBeanService
{
	public ResultSet viewPatient() throws ClassNotFoundException, SQLException{
		AdminDao ld = DaoFactory.getAdminDao();
		return ld.viewPatient();
		
		
		
	}
}

