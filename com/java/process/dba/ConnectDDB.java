package com.java.process.dba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;


public class ConnectDDB {
    
	public static Connection conn;
	public static Connection getConnection(){
    	
    	try {
	    	Class.forName("com.mysql.jdbc.Driver");
	    	String dBUserName = "root";
	        String dBPassword = "GroupPass";
	        String url = "jdbc:mysql://collegiatezone.org:3306/cmcgann1";
	        
	        Properties connectionProps = new Properties();
	        connectionProps.put("user", dBUserName);
	        connectionProps.put("password", dBPassword);
	        
				conn = DriverManager.getConnection(
				               url,
				               connectionProps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("Connected to database");
		
        return conn;
    }
    
}
