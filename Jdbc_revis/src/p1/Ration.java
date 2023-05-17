package p1;

import java.sql.*;
import java.util.Scanner;

public class Ration {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			System.out.print("Enter your name:");
			String name = scan.nextLine();
			System.out.print("Enter your age:");
			int age = scan.nextInt();

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ration", "root", "test");
			Statement st = con.createStatement();
			String query = "INSERT INTO DETAILS values('" + name + "','" + age + "')";
			int status = st.executeUpdate(query);
			if (status > 0)
				System.out.println("Inserted");
			else
				System.out.println("Error in inserting data");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
			con.close();

		}

	}

}
