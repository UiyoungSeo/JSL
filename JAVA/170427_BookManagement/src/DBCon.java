
import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {
	String driver = "com.mysql.jdbc.Driver";	//com.mysql.jdbc.Driver	//com.mysql.cj.jdbc.Driver 이게 최신 드라이버
	String url = "jdbc:mysql://localhost:3306/java?serverTimezone=UTC&useSSL=false";
	String id = "root";
	String pw = "1234";
	Connection conn = null;

	public DBCon() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnetion() {
		return conn;
	}
}
