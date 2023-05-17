package com.pizza_order_app.model;

import java.sql.*;

public class PDImple implements PDServices {
	Connection con = null;
	Statement stmnt;
 
	@Override
	public int bookPizza(String name, int pid, long phone) {

		int status = -1;
		int price = fetchPrice(pid);
		System.out.println(price);
		String query = "INSERT INTO PIZZA_RECORD (name, pizzaId, price, phone) VALUES ('" + name + "','" + pid + "','" + price + "','" + phone + "')";
		String fetchOrderId = "SELECT LAST_INSERT_ID()";
		try {
			status = stmnt.executeUpdate(query);
			if(status == 1) {
				ResultSet oID = stmnt.executeQuery(fetchOrderId);
				if(oID.next())
					return oID.getInt(1);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int fetchPrice(int pid) {
		if (pid == 1)
			return 99;
		else if (pid == 2)
			return 199;
		else if (pid == 3)
			return 299;
		else if (pid == 4)
			return 399;

		else
			return 999;

	}

	@Override
	public ResultSet fetchOrders(int orderID) {
		String query="SELECT * FROM  pizza_record WHERE orderID= '"+orderID+"'" ;
		try {
			ResultSet rs = stmnt.executeQuery(query);			
			return rs;			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;

	}

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/localdb", "root", "test");
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

}
