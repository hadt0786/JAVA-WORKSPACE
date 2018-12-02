import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateDatabase {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentInfo", "akash", "password");

			Statement s1 = (Statement) cn.createStatement();

			String sql = "create database Info";
			s1.executeQuery(sql);
			
			System.out.println("database created");
			
			
			cn.close();
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
