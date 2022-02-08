package com.hcl.controller;

import java.sql.Connection;
import java.sql.Statement;

import com.hcl.jdbc.*;

public class DataDefinitionLanguageCommands {

	public void createEmployeeSchema() {

		try {
			JDBC jdbc = new JDBC();

			Connection con = jdbc.connection();

			Statement stmt = con.createStatement();

			String sql = "CREATE TABLE EMPLOYEE " + "(id INTEGER not NULL, " + " fname VARCHAR(255), "
					+ " lname VARCHAR(255), " + " dob VARCHAR(255), " + " age INTEGER, " + " salary FLOAT not NULL, "
					+ " PRIMARY KEY ( id ))";

			stmt.executeUpdate(sql);
			System.out.println("Created table in given database...");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void dropEmployeeSchema() {
		try {
			JDBC jdbc = new JDBC();

			Connection con = jdbc.connection();

			Statement stmt = con.createStatement();

			String sql = "DROP TABLE EMPLOYEE ";

			stmt.executeUpdate(sql);
			System.out.println("Drop table in given database...");

			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
