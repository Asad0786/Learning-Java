package p1;

import java.sql.*;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) throws SQLException {

		Connection con = null ;
		Scanner scan= null;
		
		try {
			scan = new Scanner(System.in);
			System.out.print("Enter name: ");
			String name = scan.next();
			System.out.print("Enter age: ");
			int age = scan.nextInt();
			con = DriverManager.getConnection("jdbc:mysql://localhost/ration","root","test");
			Statement st = con.createStatement();
			
			String query = "Update details set age='"+age+"' where name = '"+name+"'";
			byte status = (byte) st.executeUpdate(query);
			if(status> 0)
				System.out.println("Updated");
			else
				System.out.println("Error occured");
			
		}catch(Exception e) {
			
		}finally {
			scan.close();
			con.close();
		}
	
	}
}
