package com.techmahindra.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techmahindra.beans.TestRegBean;
import com.techmahindra.daointerfaces.TestRegDao;
import com.techmahindra.utils.DBUtility;

public class TestRegDaoImplementation implements TestRegDao{

	
	public void insertDetails(TestRegBean testregbean ) 
			throws ClassNotFoundException, SQLException

	{
		Connection con1 = DBUtility.getConnection();
		
		
		int tid=testregbean.getTest_id();
		String testname=testregbean.getTest_name();
		String testtype=testregbean.getTest_type();
		String testdate=testregbean.getTest_date();
		String regdate = testregbean.getReg_date();
		//int testhr=testregbean.getTest_hr();
		//int testmin=testregbean.getTest_min();
		int amount=testregbean.getAmount();
		try
		{
		PreparedStatement st=con1.prepareStatement("insert into dc_test_reg values(?,?,?,?,?,?)");
		
		System.out.println("last");
		st.setInt(1, tid);
			
		st.setString(2,testname);
		st.setString(3,testtype);
		st.setString(4,regdate);
		st.setString(5,testdate);
		//st.setInt(6,testhr);
		//st.setInt(7,testmin);
		st.setInt(6,amount);
		int i=st.executeUpdate();
		System.out.println(i);
		
		con1.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
