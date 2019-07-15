package testcases;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.daoimplementations.LoginDaoImplementation;

public class Logintest 
{
String userName="shravya";
String password="Shra@123";

@Test
public void validate() throws ClassNotFoundException, SQLException
{
LoginBean lb=new LoginBean();
lb.setUserName(userName);
lb.setPassword(password);

LoginDaoImplementation ldi=new LoginDaoImplementation();

String role=ldi.validateUser(lb);
assertEquals("user",role);
System.out.println("successfull");
}
}
