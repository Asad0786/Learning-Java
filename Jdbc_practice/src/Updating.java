import java.sql.*;
import java.util.Scanner;

public class Updating {
	public static void main(String[] args) {
		Scanner s = null;
		Connection c = null;
		ResultSet resultSet = null;
		try {
			s = new Scanner(System.in);
			System.out.print("Enter email:");
			String email = s.nextLine();
			c = DriverManager.getConnection("jdbc:mysql://localhost/localdb", "root", "test");
			Statement stmnt = c.createStatement();
			resultSet = stmnt.executeQuery("select * from info where email = '" + email + "'");
			String numb="";
			if(resultSet.next()) {
			while (resultSet.next()) {
				System.out.println("Current Phone number is: " + resultSet.getString(5));
				numb =resultSet.getString(5);
			}
			
			}
			else
			{
				System.out.println("Email not found in registeration\nExiting...");
				System.exit(0);
			}
			System.out.print("Do you want to change your number(y/n) only?");
			char choice;
			do {
				choice = s.next().charAt(0);

				if (choice == 'n'|| choice == 'N') {
					System.out.println("Thank you for visiting");
					break;
				} else if (choice == 'y' ||choice == 'Y') {
					System.out.print("Sure, Enter your new number");
					String number = s.next();
					stmnt.executeUpdate("Update info set phone='"+number+"' where phone='"+numb+"'") ;
					System.out.println("Updated");
					break;
					
				}

			} while (choice != 'y' || choice != 'n');

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			s.close();
			try {
				resultSet.close();
				c.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
