import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentInfo", "akash", "password");
			// PreparedStatment is used to execute parameterized query
			// we are passing parameter(?) for the values
			PreparedStatement ps = cn.prepareStatement("delete from students where USN=? AND BRANCH=? ");
			ps.setString(1, "2");
			ps.setString(2, "CVE");

			int i = ps.executeUpdate();

			System.out.println("records deleted");
			// Display the table
			Statement s1 = (Statement) cn.createStatement();
			ResultSet rs = ((java.sql.Statement) s1).executeQuery("select * from students");
			while (rs.next()) {
				System.out.println("Name  :  " + rs.getString(1));
				System.out.println("address  :  " + rs.getString(2));

			}
			ps.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
