package com.techmahindra.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.daointerfaces.AdminDao;

import com.techmahindra.utils.DBUtility;

public class AdminDaoImplementation implements AdminDao{
	public ResultSet viewPatient() throws ClassNotFoundException, SQLException{
		String rs="";
        Connection con = DBUtility.getConnection();
       
       PreparedStatement psmt = con.prepareStatement("select username,patient_id from dc_registration");
                
             ResultSet rs1 = psmt.executeQuery();
      
    /*   if(rs1.next())
        {
            rs=rs1.getString("username");
            
         
        }
        else{
        	rs="invalid user";
        }*/
        return rs1;
	}
}
