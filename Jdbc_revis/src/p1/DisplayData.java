package p1;

import java.sql.*;

public class DisplayData {
	
	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try {
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ration","root","test");
			Statement st = con.createStatement();
			String query = "SELECT * FROM DETAILS ";
			ResultSet resultSet = st.executeQuery(query);
			while(resultSet.next()) {
				//System.out.println(resultSet.getString(0));
				System.out.print(resultSet.getString(1)+ " ");
				System.out.println(resultSet.getString(2));
			}
			
		}catch(Exception r) {
			r.printStackTrace();
			
		}finally {
			con.close();
		}
	}

}
