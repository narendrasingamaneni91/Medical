package com.techmahindra.services;

import java.sql.SQLException;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.daofactory.DaoFactory;
import com.techmahindra.daointerfaces.LoginDao;

public class LoginBeanService
{
	public String validateUser( LoginBean loginbean) throws ClassNotFoundException, SQLException{
		LoginDao ld = DaoFactory.getLoginDao();
		return ld.validateUser(loginbean);
		
		
		
	}
}
