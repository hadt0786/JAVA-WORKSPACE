import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentInfo", "akash", "password");
			// PreparedStatment is used to execute parameterized query
			// we are passing parameter(?) for the values
			PreparedStatement ps = cn.prepareStatement("insert into students values(?,?,?,?,?)");
			ps.setInt(1, 1);
			ps.setString(2, "usa");
			ps.setString(3,null);
			ps.setString(4, null);
			ps.setString(5, null);

			int i = ps.executeUpdate();
			System.out.println(i);
			System.out.println("records inserted");
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