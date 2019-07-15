package com.techmahindra.daoimplementations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.techmahindra.beans.PatientRegBean;
import com.techmahindra.beans.ReportBean;
import com.techmahindra.beans.TestRegBean;
import com.techmahindra.daointerfaces.ReportDao;
import com.techmahindra.utils.DBUtility;

public class ReportDaoImplementation implements ReportDao
{
	public ResultSet reportDetails( ReportBean bean) throws ClassNotFoundException, SQLException
	{
		Connection con = DBUtility.getConnection();
		int percent=15-(int)((5*Math.random()));
		
		PreparedStatement ps=con.prepareStatement("insert into dc_reports values(?,?,?)");
		ps.setInt(1,bean.getPatient_id() );
		System.out.println(bean.getPatient_id());
		ps.setInt(2, bean.getTest_id());
		//ps.setString(3, trb.getTest_name());
		ps.setInt(3,percent);
		int i=ps.executeUpdate();
		
		PreparedStatement ps1=con.prepareStatement("select * from dc_reports where pid=? and tid=?");
		ps1.setInt(1, bean.getPatient_id());
		ps1.setInt(2,bean.getTest_id());
		   ResultSet rs1 = ps1.executeQuery();
		   
	
		return rs1;
		
		
	}
	
	
}
