package p1;

import java.sql.*;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) throws SQLException {
	
		Connection con = null;
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			System.out.println("Enter name");
			String name = scan.next();
			String query = "Delete from details where name = '"+name+"'";
			con = DriverManager.getConnection("jdbc:mysql://localhost/ration","root","test");
			Statement st = con.createStatement();
			byte status = (byte) st.executeUpdate(query);
			
			if(status>0)
				System.out.println("Success");
			else 
				System.out.println("Data not found for this name");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			scan.close();
			con.close();
		}
	}

}
