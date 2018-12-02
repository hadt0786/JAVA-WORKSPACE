import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentInfo", "akash", "password");
			// PreparedStatment is used to execute parameterized query
			// we are passing parameter(?) for the values
			PreparedStatement ps = cn.prepareStatement("update students set USN =? where BRANCH =?");

			ps.setInt(1, 2);
			ps.setString(3, "CSE");

			int i = ps.executeUpdate();
			System.out.println(i);
			System.out.println("records updated");
			ps.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
