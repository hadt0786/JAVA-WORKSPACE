import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateDatabaseTest {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");

//			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentInfo", "akash", "password");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/INFO", "akash", "password");

			// PreparedStatment is used to execute parameterized query
			// we are passing parameter(?) for the values
			Statement s1 = cn.createStatement();
//			String sql = "CREATE DATABASE INFO";
//			s1.executeUpdate(sql);
//			System.out.println("Database created");
//			System.out.println("Creating table");
			
			
//			String sql1 = "CREATE TABLE REGISTRATION1" + "(id INTEGER not NULL," + "first VARCHAR(255),"
//					+ "last VARCHAR (255)," + "age INTEGER, " + "PRIMARY KEY(id))";
//			s1.executeUpdate(sql1);
			System.out.println("table created");
			String sql3 = " INSERT INTO registration1 VALUES('101','zoya','khan','20')";
			s1.executeUpdate(sql3);
			System.out.println("values inserted");
			String sql = "SELECT id, first, last, age from registration1";
			ResultSet rs = s1.executeQuery(sql);

			while (rs.next()) {
				System.out.println("ID  :  " + rs.getString("id"));
				System.out.println("Firstname  :  " + rs.getString("first"));

			}
			// int i =ps.executeUpdate();
			System.out.println("Successful");
			
			Statement s2 = (Statement) cn.createStatement();
			ResultSet rs2 = ((java.sql.Statement) s2).executeQuery("select * from REGISTRATION1");
			while (rs2.next()) {
				System.out.println("ID  :  " + rs2.getString(1));
				System.out.println("FIRST  :  " + rs2.getString(2));

				System.out.println("LAST  :  " + rs2.getString(3));

				System.out.println("AGE  :  " + rs2.getString(3));

//				System.out.println("FIRST  :  " + rs2.getString(2));

			}
			
			s1.close();
		} catch (Exception e) {

			System.out.println(e);

		}

	}
}
