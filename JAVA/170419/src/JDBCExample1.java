import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {
	public static void main(String[] args) {
		Connection con = null; // java와 db를 연결할 수 있는 객체

		try {
			Class.forName("com.mysql.jdbc.Driver"); // mysql에서 제공하는 드라이버
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "1234");
			// 127.0.0.1:3306 대신 localhost라고 써도된다. java는 db 이름
			/*			
				String url = "jdbc:mysql://127.0.0.1:3306/java";
				String id = "root";
				string pw = "1234";
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, id, pw);
			*/

			System.out.println("db connected");

		} catch (ClassNotFoundException e) {
			System.out.println("could not find driver");
		} catch (SQLException e) {
			System.out.println("failed to connect");
		}
	}
}
