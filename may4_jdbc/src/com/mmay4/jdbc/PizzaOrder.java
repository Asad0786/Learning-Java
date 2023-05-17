package com.mmay4.jdbc;

import java.sql.*;
import java.util.Scanner;

public class PizzaOrder {

	static Connection con;
	static Statement stmnt;

	public void connectDB() {

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost/localdb", "root", "test");
			stmnt = con.createStatement();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

	public void disconnectDB() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void orderRecord(String customerName, int pizzaId, int price, long phone) {

		String query = "INSERT INTO PIZZA VALUES ('" + customerName + "','" + pizzaId + "','" + price + "','" + phone
				+ "')";
		try {
			int status = stmnt.executeUpdate(query);
			if (status > 0) {
				System.out.println("\nDone ordered!! \n");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		PizzaOrder p1 = new PizzaOrder();
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Want to order? \npress 'y' to order\n else anything else");
			System.out.print("\nEnter your choice");
			char choice = scan.next().charAt(0);

			if (choice == 'y') {
				
			//	do{
				System.out.print("Enter your name:");
				String name = scan.nextLine();
				name = scan.nextLine();
				System.out.print("Enter pizza id:");
				int pId = scan.nextInt();
				System.out.println(pId);
				System.out.print("Price:");
				int price = scan.nextInt();
				System.out.print("Enter number:");
				long phone = scan.nextLong();
			//	}while(name=="" && pId =);
				
				
				p1.connectDB();
				p1.orderRecord(name, pId, price, phone);

			} else
				break;
		}

		System.out.println("\n\tThank you!!");

	}

}
