import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.PreparedStatement;

public class JDBCExample3 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("could not find driver");
		}
		Connection conn = null;
		// Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// String name = "satomi";
		// String jumin = "777777-7777777";
		// String birth = "2007-07-17";
		// String query = "insert into PERSON_TB values (null, '" + name + "','"
		// + jumin + "','" + birth + "')";

		String query = "select * from PERSON_TB where num > ?";

		try {
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "1234");

			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, 5);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				int num = rs.getInt(1); // 1번째 필드
				String name = rs.getString(2); // 2번째 필드
				String jumin = rs.getString(3);
				java.sql.Date date = rs.getDate(4); // sql의 date를 java의 util에 있는
													// Date형식으로 바꾼다.
				java.util.Date d = new java.util.Date(date.getTime());
				System.out.print(num + "\t");
				System.out.print(name + "\t");
				System.out.print(jumin + "\t");
				System.out.println(d.toString());
			}
			pstmt.close();

			// pstmt.setString(1, name);
			// pstmt.setString(2, jumin);
			// pstmt.setString(3, birth);
			// pstmt.executeUpdate();
			// pstmt.close();

			// stmt = conn.createStatement();
			// stmt.executeUpdate(query); // data 삽입 명령
			// stmt.close();
			conn.close();
			System.out.println("Update Success!");

		} catch (SQLException e1) {
			System.out.println("Update Fail");
		}
	}
}
