package bank;
import java.sql.*;

public class Connectiondriver {

	Connection con;
	Statement stmt;
	
	public Connectiondriver() {
		try {
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/LoanSystem","root","mysql123");
			stmt =con.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
