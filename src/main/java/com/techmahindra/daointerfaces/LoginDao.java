package com.techmahindra.daointerfaces;

import java.sql.SQLException;

import com.techmahindra.beans.LoginBean;

public interface LoginDao 
{
	public abstract String validateUser(LoginBean loginbean ) 
			throws ClassNotFoundException, SQLException;

}
