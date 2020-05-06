package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.services.SqlConnect;

public class UserDAO {

	private Connection con;
	private PreparedStatement ps;
	
	
	public void insertUser(String name, String password, String role, String phoneno, String email, String city, String age) throws SQLException
	{
	
    	int m;
    	String sql="insert into user (name, password, role, phoneno, email, city, age) values(?,?,?,?,?,?,?);";
    	con = SqlConnect.getConnection();
    	ps = con.prepareStatement(sql);
    	ps.setString(1, name);
    	ps.setString(2, password);
    	ps.setString(3, role);
    	ps.setString(4, phoneno);
    	ps.setString(5, email);
    	ps.setString(6, city);
    	ps.setString(7, age);
    	m=ps.executeUpdate();
   
	}
}
