package com.techmahindra.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtility 
{
	public static Connection getConnection( ) throws ClassNotFoundException, SQLException{
        Connection con = null;

        Class.forName("oracle.jdbc.driver.OracleDriver");
		
		 con=DriverManager.getConnection("jdbc:oracle:thin:@hstslc015:1521:elp","elp1115","msat123$");
		 System.out.println("In the connection");
            return con;
            

        }

     public static void closeConnection(Connection con) throws SQLException{
         con.close( );
    }
}
