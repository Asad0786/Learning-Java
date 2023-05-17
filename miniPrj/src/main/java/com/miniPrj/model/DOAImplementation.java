package com.miniPrj.model;

import java.sql.*;

public class DOAImplementation implements DAOService {

	private Connection con;
	private Statement stmnt;

	@Override
	public boolean verifyUser(String email, String pass) {
		System.out.println(email + " " + pass);
		String query = "SELECT * FROM INFO WHERE email='" + email + "' and password='" + pass + "'";
		try {
			ResultSet rS = stmnt.executeQuery(query);
			return rS.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int addNewUser(String name, int age, String parentAge, String email) {

		String fetchQuery = "SELECT LAST_INSERT_ID()";
		String query = "Insert into registration(name,age,parentage,email) values('" + name + "','" + age + "','"
				+ parentAge + "','" + email + "')";
		try {
			int rS = stmnt.executeUpdate(query);
			if (rS == 1) {
				ResultSet fetch = stmnt.executeQuery(fetchQuery);
				if (fetch.next())
					return (fetch.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;

	}

	@Override
	public void removeUser(String email) {

	}

	@Override
	public void updateUser(String name, String email, String password) {

	}

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/studentdata", "root", "test");
			stmnt = con.createStatement();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Override
	public void closeDB() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public ResultSet fetchID() {

		String query = "SELECT LAST_INSERT_ID()";
		try {
			ResultSet rS = stmnt.executeQuery(query);
			return rS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
