package com.hcl.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC {

	public Connection connection() {
		// Open a connection
		System.out.println("Starting JDBC..\n");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/HCL?&useSSL=false", "root", "");

			return con;

		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
