package com.home.chatapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.home.chatapp.DTO.UserDTO;
import com.home.chatapp.utils.passEncrypt;

// USER CRUD 
public class UserDAO {
	// receive the dto 
	public boolean isLogin(UserDTO userDTO) throws SQLException, ClassNotFoundException, Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		final String SQL = "select userid from users where userid=? and password=?";
		try {
			con = commonDao.createConnection();
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, userDTO.getUserid()); // get the value from the dto
			String encryptedPwd = passEncrypt.encrypt(new String(userDTO.getPassword()));
			pstmt.setString(2,encryptedPwd);
			rs = pstmt.executeQuery();
			return rs.next();
//			if(rs.next()) {
//				return true;
//			}
//			else {
//				return false;
//			}
		}
		finally {
			if(rs!=null) {
				rs.close();
			}
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	
	//public int add(String userid, String password, byte age, String city, String phone , String email, String country, String state, String areaCode, String stdCode){
	public int add(UserDTO userDTO) throws ClassNotFoundException, SQLException, Exception {	
		System.out.println("Rec "+userDTO.getUserid()+" "+userDTO.getPassword());
		Connection connection = null;
		Statement stmt = null; // query
		try { // Guarded region
		connection = commonDao.createConnection(); // Step-1 Connection Create
		// Step-2 We do a Query
		stmt = connection.createStatement();
		// insert into users (userid, password) values('ram','ram123');
		int record = stmt.executeUpdate("insert into users (userid, password) values('"+userDTO.getUserid()+"','"+passEncrypt.encrypt(new String(userDTO.getPassword()))+"')"); // Insert, Delete, Update 
		return record;
		}
		finally { // Always execute (Resource Clean)
			if(stmt!=null) {
		stmt.close();
			}
			if(connection!=null) {
		connection.close();
			}
		}
	
		
	}

}
