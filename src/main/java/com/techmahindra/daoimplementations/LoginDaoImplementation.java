package com.techmahindra.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.daointerfaces.LoginDao;
import com.techmahindra.utils.DBUtility;

public class LoginDaoImplementation implements LoginDao{
	public String validateUser( LoginBean loginbean) throws ClassNotFoundException, SQLException{
		String role="";
        Connection con = DBUtility.getConnection();
       
       PreparedStatement psmt = con.prepareStatement("select role from dc_login where username=? and password=?");
    
       
       
       psmt.setString(1, loginbean.getUserName());
       psmt.setString(2, loginbean.getPassword());
       ResultSet rs = psmt.executeQuery();
      
       if(rs.next())
        {
            role=rs.getString("role");
            
         
        }
        else{
        	role="invaliduser";
        }
        return role;
	}
}
