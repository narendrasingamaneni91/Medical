package com.techmahindra.daointerfaces;

import java.sql.SQLException;

import com.techmahindra.beans.PaymentBean;

public interface PaymentDao 
{
	public int paymentDetails(PaymentBean paybean ) 
			throws ClassNotFoundException, SQLException;
}
