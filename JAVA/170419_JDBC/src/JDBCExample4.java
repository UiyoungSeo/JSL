import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

public class JDBCExample4 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("error =" + e);
			System.exit(1);
		}
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		PreparedStatement pstmt = null;

		String name = "satomi";
		String jumin = "777777-7777777";
		String birth = "2007-07-17";
		String query = "insert into PERSON_TB values (null, '" + name + "','" + jumin + "','" + birth + "')";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "1234");

			stmt = conn.createStatement();
			stmt.executeUpdate(query); // data 삽입 명령
			System.out.println("Update Success!");

			rs = stmt.executeQuery("select * from PERSON_TB");

			System.out.println("번호 이름 \t\t 주민등록번호 생일");
			System.out.println("-----------------------------------");

			while (rs.next()) {
				String no = rs.getString("num");
				name = rs.getString("name");
				jumin = rs.getString("jumin");
				birth = rs.getString("birth");
				System.out.printf("%s %s %s %s%n", no, name, jumin, birth);
			}

			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("Update Fail");
		}
	}
}
