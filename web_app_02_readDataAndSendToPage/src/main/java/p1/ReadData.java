package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/abcd")
public class ReadData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ReadData() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con = null;
		ResultSet rset = null;
		response.setContentType("text/html");
		System.out.println("Get Called");
		PrintWriter out = response.getWriter();
		
		//creating table
		out.print("<table border=1>");
		out.print("<tr>");
		out.print("<th>");
		out.print("Name");
		out.print("</th>");
		out.print("<th>");
		out.print("City");
		out.print("</th>");
		out.print("<th>");
		out.print("Email");
		out.print("</th>");
		out.print("<th>");
		out.print("Phone number");
		out.print("</th>");
		out.print("</tr>");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/localdb","root","test");
			Statement st = con.createStatement();
			rset = st.executeQuery("SELECT * FROM info ");
			while(rset.next()) {
				out.print("hellobro");
				out.print("<tr>");
				out.print("<th>");
				out.print(rset.getString(1));
				out.print("</th>");
				out.print("<th>");
				out.print(rset.getString(2));
				out.print("</th>");
				out.print("<th>");
				out.print("asd");
				out.print(rset.getString(3));
				out.print("</th>");
				out.print("<th>");
				out.print(rset.getString(5));
				out.print("</th>");
				out.print("</tr>");
			}
			out.print("</table>");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
