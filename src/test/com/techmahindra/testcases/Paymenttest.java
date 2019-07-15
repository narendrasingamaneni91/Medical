package testcases;

import static org.junit.Assert.assertEquals;

import java.sql.SQLException;

import org.junit.Test;

import com.techmahindra.beans.LoginBean;
import com.techmahindra.beans.PaymentBean;
import com.techmahindra.daoimplementations.LoginDaoImplementation;
import com.techmahindra.daoimplementations.PaymentDaoImplementation;

public class Paymenttest 
{
String username="shravya";
int patient_id=2345;
int test_id=21;
int amount=400;
@Test
public void paymentDetails() throws ClassNotFoundException, SQLException
{
PaymentBean lb=new PaymentBean();
lb.setUsername(username);
lb.setPatient_id(patient_id);
lb.setTest_id(test_id);
lb.setAmount(amount);


PaymentDaoImplementation ldi=new PaymentDaoImplementation();

int i=ldi.paymentDetails(lb);
assertEquals(1,i);
System.out.println("successfull");
}
}
