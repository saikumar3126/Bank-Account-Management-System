package com.bank;

import java.sql.Connection;

public class Testconnection {
	public static void main(String[] args) {
		Connection con = DBConnection.getConnection();
		
		if (con != null) {
			System.out.println("Connection succesfull!");
		} else {
			System.out.println("Connection failed");
		}
	}
	
	}
