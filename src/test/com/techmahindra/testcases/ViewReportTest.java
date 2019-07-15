package testcases;

import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.techmahindra.beans.ReportBean;
import com.techmahindra.daoimplementations.ReportDaoImplementation;



public class ViewReportTest
{
	int patient_id=123;
	int test_id=21;
	int percent=11;
	int pid=0;
	@Test
	public void reportDetails() throws ClassNotFoundException, SQLException
	{
	ReportBean lb=new ReportBean();
	lb.setPatient_id(patient_id);
	lb.setTest_id(test_id);

	ReportDaoImplementation ldi=new ReportDaoImplementation();

	ResultSet rs=ldi.reportDetails(lb);
	while(rs.next())
	{
		int pid=rs.getInt(1);
		//int tid=rs.getInt(2);
		//int perc=rs.getInt(3);
	
	assertEquals(123,pid);
	}
	System.out.println("successfull");
	}
}
