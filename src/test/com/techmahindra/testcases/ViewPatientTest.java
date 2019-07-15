package testcases;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.techmahindra.beans.PatientRegBean;
import com.techmahindra.beans.ReportBean;
import com.techmahindra.daoimplementations.AdminDaoImplementation;
import com.techmahindra.daoimplementations.ReportDaoImplementation;

public class ViewPatientTest 
{

@Test
public void viewPatient() throws ClassNotFoundException, SQLException
{
PatientRegBean lb=new PatientRegBean();


AdminDaoImplementation ldi=new AdminDaoImplementation();

ResultSet rs=ldi.viewPatient();
while(rs.next())
{
//String uname=rs.getString(1);
	
assertNotNull(rs);

}
System.out.println("successfull");
}
}


