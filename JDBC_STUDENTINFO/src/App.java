import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// forName is used to register the driver class
			Class.forName("com.mysql.jdbc.Driver");

			// creating the connection object
			// set the default password for ubuntu
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentInfo", "akash", "password");
			// creating the statement object
			Statement s1 = (Statement) cn.createStatement();
			ResultSet rs = ((java.sql.Statement) s1).executeQuery("select * from students");
			while (rs.next()) {
				System.out.println("Name  :  " + rs.getString(1));
				System.out.println("address  :  " + rs.getString(2));

			}
			cn.close();// closing the connection
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
