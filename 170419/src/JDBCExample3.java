import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("could not find driver");
		}
		Connection conn = null;
		Statement stmt = null;

		String name = "satomi";
		String jumin = "777777-7777777";
		String birth = "2007-07-17";

		String query = "insert into PERSON_TB values (null, '" + name + "','" + jumin + "','" + birth + "')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "1234");

			stmt = conn.createStatement();
			stmt.executeUpdate(query); // data 삽입 명령
			stmt.close();
			conn.close();
			System.out.println("Update Success!");

		} catch (SQLException e1) {
			System.out.println("Update Fail");
		}
	}
}
