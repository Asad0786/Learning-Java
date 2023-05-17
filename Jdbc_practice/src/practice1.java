import java.sql.*;
import java.util.Scanner;

public class practice1 {

	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		Connection c = null;

		try {
			System.out.print("Enter name:");
			String name = scan.nextLine();
			System.out.print("Enter city:");
			String city = scan.nextLine();
			System.out.print("Enter email:");
			String email = scan.nextLine();
			System.out.print("Enter password:");
			String password = scan.nextLine();
			System.out.print("Enter number:");
			String number = scan.nextLine();
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/localdb", "root", "test");
			Statement s = c.createStatement();
			s.execute("insert into info values('" + name + "','" + city + "','" + email + "','" + password + "','"
					+ number + "')");
			// s.executeQuery("");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scan.close();
			try {
			c.close();
			}catch(Exception e){
					e.printStackTrace();
			}
		}
	}
}
