import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample2 {
	public static void main(String[] args) {
		Connection conn = null; // 데이터베이스와 연동하는 클래스
		Statement stmt = null; // SQL문을 실행하는 클래스
		ResultSet rs = null; // 검색 결과 등의 결과값을 담을수 있는 클래스. vector형식의 table로 저장한다.
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/java", "root", "1234");
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from GOODS_INFO_TB");

			System.out.println("상품코드 상품명 \t\t 가격  제조사");
			System.out.println("-------------------------------------");
			while (rs.next()) { // ResultSet에 객체가 있는 만큼 반복한다.
				String code = rs.getString("code");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				String maker = rs.getString("maker");
				System.out.printf("%5s %s \t%12d %s%n", code, name, price, maker);
			}
			// select만 executeQuery로 실행한다.
			// 나머지는 executeUpdate로 실행한다.
		} catch (ClassNotFoundException e) {
			System.out.println("could not find driver");
		} catch (SQLException e) {
			System.out.println("failed to connect");
		} 
	}
}
