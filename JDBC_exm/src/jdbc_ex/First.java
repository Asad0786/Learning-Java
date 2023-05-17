package jdbc_ex;

import java.sql.*;
import java.util.Scanner;

public class First {
	public static void main(String[] args) {
		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("Enter Your Name:");
//			String name = sc.nextLine();
//			System.out.print("Enter Your email:");
//			String email = sc.next();
//			System.out.print("Enter Your Phone:");
//			String phone = sc.next();
			//sc.close();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/localdb","root","test");
			//System.out.println(conn);
			Statement S1 = conn.createStatement();
			ResultSet res = S1.executeQuery("SELECT * FROM info");
			//S1.executeUpdate("insert into info values('"+name+"','"+email+"','"+phone+"')");
			
			while(res.next()) {
				System.out.println(res.getString(1));
				System.out.println(res.getString(2));
				System.out.println(res.getString(3));
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
