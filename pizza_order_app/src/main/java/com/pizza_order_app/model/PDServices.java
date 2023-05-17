package com.pizza_order_app.model;

import java.sql.ResultSet;

public interface PDServices {
	
	public int bookPizza(String name, int pid, long phone);
	public int fetchPrice(int pid);
	public ResultSet fetchOrders(int orderID);
	public void connectDB();
	public void closeDB();
	
}
