package com.home.chatapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static com.home.chatapp.utils.configReader.getValue;


public class commonDao {
	public Connection createConnection()  {
	   
		try{  
			Class.forName(getValue("DRIVER")); 
	   final String Connection_string=getValue("CONNECTION_URL");
	   final String user_id=getValue("USERID");
	   final String password=getValue("PASSWORD");
	   Connection con=DriverManager.getConnection(Connection_string,user_id,password);
	   
	   if(con!=null) {
		   System.out.println("Connection created");
		   con.close();
	   }
	   return con;
	   
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	  
	
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		commonDao CommonDao=new commonDao();
		CommonDao.createConnection();
	}

}
