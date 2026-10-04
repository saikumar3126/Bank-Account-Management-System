package com.bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() {
		Connection con =  null;
		
		try { con = DriverManager.getConnection(
		        "jdbc:mysql://localhost:3306/bankdb",
		        "root",
		        "Sai@2002"
		);
			
			System.out.println("Database connected successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
