package com.hms.model;

import java.sql.*;

public class DBConnection {

	private String url = "jdbc:mysql://localhost:3306/hms";
	private String user = "root";
	private String password = "test";
	private Connection connection;

	public DBConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		if (connection == null) {
			try {
				connection = DriverManager.getConnection(url, user, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

	public void closeConnection() {
		if(connection!=null) {
			try {
				connection.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}
}
