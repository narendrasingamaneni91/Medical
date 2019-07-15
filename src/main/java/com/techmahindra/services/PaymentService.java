package com.techmahindra.services;

import java.sql.SQLException;

import com.techmahindra.beans.PaymentBean;
import com.techmahindra.daofactory.DaoFactory;
import com.techmahindra.daointerfaces.PaymentDao;

public class PaymentService 
{
	public int paymentDetails(PaymentBean paybean ) 
			throws ClassNotFoundException, SQLException
	{
		PaymentDao pd=DaoFactory.getPaymentDao();
		return pd.paymentDetails(paybean);
	}

}
