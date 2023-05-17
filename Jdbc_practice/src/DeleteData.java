import java.sql.*;
import java.util.Scanner;

public class DeleteData {
	public static void main(String[] args) {
		Scanner scan = null;
		Connection con = null;

		try {
			scan = new Scanner(System.in);
			System.out.print("Enter email:");
			String email = scan.next();
			con = DriverManager.getConnection("jdbc:mysql://localhost/localdb", "root", "test");
			Statement stmt = con.createStatement();
			int rowCount = stmt.executeUpdate("Delete from info where email ='" + email + "'");
			if(rowCount>0)
				System.out.println("deleted");
			else
				System.out.println("Record not found");
		} catch (Exception e) {

			e.printStackTrace();

		} finally {
			scan.close();
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
