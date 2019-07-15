package com.techmahindra.daointerfaces;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.techmahindra.beans.LoginBean;

public interface AdminDao 
{
	public abstract ResultSet viewPatient() 
			throws ClassNotFoundException, SQLException;

}
