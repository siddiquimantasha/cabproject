package com.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlConnect 
{

	    private static String url = "jdbc:mysql://localhost:3306/CabServiceDB?autoReconnect=true&useSSL=false";    
	    private static String driverName = "com.mysql.jdbc.Driver";   
	    private static String username = "root";   
	    private static String password = "root@123";
	    private static Connection con;

	    public static Connection getConnection() {
	        try {
	            Class.forName(driverName);
	            try {
	                con = DriverManager.getConnection(url, username, password);
	                System.out.println("Connection established");
	            } catch (SQLException ex) {
	       
	                System.out.println("Failed to create the database connection."); 
	            }
	        } catch (ClassNotFoundException ex) {
	            
	            System.out.println("Driver not found."); 
	            ex.printStackTrace();
	        }
	        
	        return con;
	    }
	    
		/*
		 * public static void main(String[] args) throws SQLException { // //
		 * SqlConnect.getConnection(); Connection con = null; Statement stmt = null;
		 * ResultSet rs = null; int m; String
		 * sql="insert into user values('3','mantasha','mantasha','customer','1234567890');"
		 * ; con = SqlConnect.getConnection(); stmt = con.createStatement();
		 * 
		 * m=stmt.executeUpdate(sql); System.out.println("row inserted");
		 * 
		 * rs = stmt.executeQuery("select * from user;"); while(rs.next())
		 * System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+
		 * " "+rs.getString(4)+" " +rs.getString(5)); }
		 */
	      
}
