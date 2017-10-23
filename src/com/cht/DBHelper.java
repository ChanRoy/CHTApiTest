package com.cht;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class DBHelper {
	
	public static final String url = "jdbc:mysql://localhost:3306/students_manage";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "cht";
	
	public Connection conn = null;
	public PreparedStatement pst = null;
	
	public DBHelper(String sql) {
		
		try {
			
			Class.forName(name);
			conn = DriverManager.getConnection(url, user, password);
			pst = (PreparedStatement) conn.prepareStatement(sql);
			
			System.out.println("db connected success!");
			
		} catch(Exception e) {
			
			System.out.println("db connected fail!");
			
			e.printStackTrace();
		}
	}
	
	public void close() {
		
		try {
			
			this.conn.close();
			this.pst.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
