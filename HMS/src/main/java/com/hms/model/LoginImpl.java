package com.hms.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginImpl implements LoginServicesModel {

	private DBConnection dbVar;
	private Connection con;

	public LoginImpl() {
		dbVar = new DBConnection();
		con = dbVar.getConnection();
	}

	@Override
	public int authenticateUser(String email, String password, String role) {
		try {
			PreparedStatement stmn = con.prepareStatement(getRole(role));
			stmn.setString(1, email);
			stmn.setString(2, password);
			ResultSet rs = stmn.executeQuery();
			if (rs.next())
				return rs.getInt(1);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public LoginUserData getUserDetails(int id, String role) {
		try {
			String query = "";
			if (role.toLowerCase().equals("patient")) {
				query = "SELECT * FROM patient where patient_id = ?";

			} else if (role.toLowerCase().equals("doctor")) {
				query = "SELECT * FROM doctor where doctor_id = ?";

			} else if (role.toLowerCase().equals("reception")) {

				query = "SELECT * FROM reception where reception_id = ?";
			}
			PreparedStatement stmnt = con.prepareStatement(query);
			stmnt.setInt(1, id);
			ResultSet rs = stmnt.executeQuery();
			if (rs.next()) {

				LoginUserData userData = new LoginUserData();
				userData.setId(id);
				userData.setName(rs.getString(2));
				userData.setEmail(rs.getString(3));
				userData.setGender(rs.getString(5));
				userData.setContact(rs.getString(6));
				return userData;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean logout(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getRole(String role) {

		switch (role) {

		case "Patient":
			role = "SELECT * FROM patient WHERE email=? AND password=?";
			break;

		case "Doctor":
			role = "SELECT * FROM doctor WHERE email=? AND password=?";
			break;

		case "Reception":
			role = "SELECT * FROM reception WHERE email=? AND password=?";
			break;

		default:
			role = "SELECT * FROM admin WHERE email=? AND password=?";
		}

		return role;
	}

	@Override
	public boolean changeEmail(String email, String newEmail) {
		try {
			String query = "Update doctor set email=? where email=?";
			PreparedStatement stmnt = con.prepareStatement(query);
			stmnt.setString(1, newEmail);
			stmnt.setString(2, email);
			int status = stmnt.executeUpdate();
			System.out.println(status);
			if (status > 0)
				return true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean changePassword(String email, String oldPass, String newPass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ResultSet fetchRecord(String role) {
		try {
			String query;
			if (role.toLowerCase().equals("patient"))
				query = "Select * from " + role;
			else
				query = "select * from " + role;
			PreparedStatement stmnt = con.prepareStatement(query);
			ResultSet rs = stmnt.executeQuery();

			return rs;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public int changeSatus(String role, int id, boolean st) {
		try {
			System.out.println(2);
			String query = "Update doctor set status=? where doctor_id=?";
			PreparedStatement stmnt = con.prepareStatement(query);
			stmnt.setBoolean(1, !st);
			stmnt.setInt(2, id);
			int status = stmnt.executeUpdate();
			System.out.println(status);
			if (status > 0)
				return status;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int bookAppointment(int pId, int dID, String date, String disease) {
		try {
			System.out.println(pId);
			System.out.println(dID);
			String query = "insert into disease (patient_id,doctor_id,disease,date) values(?,?,?,?);";
			PreparedStatement stmn = con.prepareStatement(query);
			stmn.setInt(1, pId);
			stmn.setInt(2, dID);
			stmn.setString(3, disease);
			stmn.setString(4, date);
			int status = stmn.executeUpdate();
			System.out.println(status);
			if (status > 0)
				return status;
			else {
				System.out.println("err1");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public ResultSet fetchRecordByEmail(String role, String email) {
		try {
			String query = "select * from " + role + " where email=?";
			PreparedStatement stmnt = con.prepareStatement(query);
			stmnt.setString(1, email);
			ResultSet rs = stmnt.executeQuery();
			return rs;
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ResultSet fetchAppo() {
		try {
			String query= "Select * from disease";
			PreparedStatement stmnt = con.prepareStatement(query);
			ResultSet rs = stmnt.executeQuery();

			return rs;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ResultSet fetchRecordById(String role, int id) {
		try {
			String query = "select * from " + role + " where "+role +"_id=?";
			PreparedStatement stmnt = con.prepareStatement(query);
			stmnt.setInt(1, id);
			ResultSet rs = stmnt.executeQuery();
			return rs;
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
