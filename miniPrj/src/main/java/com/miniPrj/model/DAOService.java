package com.miniPrj.model;

import java.sql.ResultSet;

public interface DAOService {
	
	public void connectDB();
	public boolean verifyUser(String email, String pass);
	public int addNewUser(String name, int age, String parentAge, String email );
	public void removeUser(String email );
	public void updateUser(String name, String email, String password);
	public ResultSet fetchID();
	public void closeDB();
}
