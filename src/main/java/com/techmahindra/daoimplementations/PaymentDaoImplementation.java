package com.techmahindra.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.techmahindra.beans.PaymentBean;
import com.techmahindra.daointerfaces.PaymentDao;
import com.techmahindra.utils.DBUtility;

public class PaymentDaoImplementation implements PaymentDao {
	public int paymentDetails(PaymentBean paybean ) 
			throws ClassNotFoundException, SQLException
	{
Connection con = DBUtility.getConnection();
		
		String pname =paybean.getUsername();
		int pid=paybean.getPatient_id();
		int tid=paybean.getTest_id();
		int amount=paybean.getAmount();
		PreparedStatement ps = con.prepareStatement("insert into dc_payment values(?,?,?,?)");
		ps.setString(1, pname);
		ps.setInt(2, pid);
		ps.setInt(3, tid);
		ps.setInt(4, amount);
		int i=ps.executeUpdate();
		con.close();
		return i;
		
	}


}
