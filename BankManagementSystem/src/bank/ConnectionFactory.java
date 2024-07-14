package bank;
import java.sql.*;
public class ConnectionFactory {

	Connection con;
	Statement stmt;
	
	
	public ConnectionFactory() {
		
		try {
			//Loading the Driver 
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Establish the Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankManagement","root","mysql");
			stmt=con.createStatement();
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}
}
