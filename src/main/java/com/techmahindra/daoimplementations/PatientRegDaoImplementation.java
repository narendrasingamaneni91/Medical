package com.techmahindra.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techmahindra.beans.PatientRegBean;
import com.techmahindra.daointerfaces.PatientRegDao;
import com.techmahindra.utils.DBUtility;

public class PatientRegDaoImplementation implements PatientRegDao {
	public void patDetails(PatientRegBean patregbean ) 
			throws ClassNotFoundException, SQLException
			{
		Connection con = DBUtility.getConnection();
		con.setAutoCommit(true);
		String name="user";
		System.out.println("First implementation");
		try
		{
		PreparedStatement st=con.prepareStatement("insert into dc_registration values(?,?,?,?,?,?,?,?,?)");
		System.out.println("Second implementations");
		st.setInt(1,patregbean.getPatient_id());
		st.setString(2,patregbean.getUsername());
		st.setString(3,patregbean.getPassword());
		st.setInt(4,patregbean.getAge());
		st.setString(5,patregbean.getGender());
		st.setString(6,patregbean.getDoctorName());
		st.setString(8,patregbean.getAppointmentTime());
		st.setString(7, patregbean.getAppointmentDate());
		st.setString(9, patregbean.getPhoneno());
		

		
		int n=st.executeUpdate();
		System.out.println("In the implementation"+n);
			st.close();
	
		
		PreparedStatement st1=con.prepareStatement("insert into dc_login values(?,?,?)");
		st1.setString(1,patregbean.getUsername());
		st1.setString(2,patregbean.getPassword());
		st1.setString(3,name);
		
		st1.executeUpdate();
		st1.close();
		con.close();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	

}
