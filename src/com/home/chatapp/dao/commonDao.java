package com.home.chatapp.dao;

import static com.home.chatapp.utils.configReader.getValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Throw Early and catch Later
public interface commonDao {
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		// Step-1 Load a Driver
		Class.forName(getValue("DRIVER"));
		// Step-2 Making a Connection
		final String CONNECTION_STRING = getValue("CONNECTION_URL");
		final String USER_ID = getValue("USERID");
		final String PASSWORD = getValue("PASSWORD");
		Connection con = DriverManager.getConnection(CONNECTION_STRING, USER_ID, PASSWORD);
		if(con != null) {
			System.out.println("Connection Created...");
			//con.close();
		}
		return con;
		
	}
	
	
}
