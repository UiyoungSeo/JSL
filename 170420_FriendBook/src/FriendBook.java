import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//

public class FriendBook {
	public static void main(String[] args) {
		try {
			Class.forName("org.gjt.mm.mysql.Driver"); // mysql 드라이버가 두가지이다.
			System.out.println("드라이버 검색 성공!");
		} catch (ClassNotFoundException e) {
			System.err.println("error =" + e);
			System.exit(1);
		}

		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null; // 필드가 하나일때는 굳이 동적쿼리를 사용 할 필요가 없다.
		ResultSet rs = null;

		String url = "jdbc:mysql://127.0.0.1:3306/java";
		String id = "root";
		String pass = "1234";
		String query = null;
		try {
			conn = DriverManager.getConnection(url, id, pass);
		} catch (SQLException e) {
			System.err.println("sql error=" + e);
			System.exit(1);
		}
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.친구 추가 2.생년월일로 검색 3.친구목록 보기 4.친구 삭제 5.수정 6.종료 >>");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("이름>>");
				String name = sc.next();
				System.out.print("생년월일>>");
				String birthdate = sc.next();
				query = "insert into FRIEND_TB values (null,?,?)";

				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, name);
					pstmt.setString(2, birthdate);
					pstmt.executeUpdate();
					pstmt.close();
					System.out.println("등록되었습니다.");
				} catch (SQLException e) {
					System.err.println("sql error=" + e);
				}
			} else if (choice == 2) {
				System.out.print("찾을 친구 생년월일>>");
				String birthdate = sc.next();
				query = "SELECT num, name FROM FRIEND_TB WHERE birthdate = ?";
				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setString(1, birthdate);
					rs = pstmt.executeQuery();

					if (rs.next()) {
						System.out.println("검색결과 이름:" + rs.getString("name"));
						System.out.println("검색결과 번호:" + rs.getInt("num"));
					} else
						System.out.println("찾는 친구가 없습니다.");
					rs.close();
					pstmt.close();
				} catch (SQLException e) {
					System.err.println("sql error=" + e);
				}
			} else if (choice == 3) {
				query = "select * from FRIEND_TB";
				try {
					stmt = conn.createStatement();
					rs = stmt.executeQuery(query);

					System.out.println("번호 \t 이름\t 생년월일");
					System.out.println("-------------------");
					while (rs.next()) {
						int num = rs.getInt("num");
						String name = rs.getString("name");
						String birthdate = rs.getString("birthdate");
						System.out.printf("%d %10s %s\n", num, name, birthdate);
					}
					rs.close();
					stmt.close();
				} catch (SQLException e) {
					System.err.println("sql error=" + e);
				}
			} else if (choice == 4) {
				System.out.print("삭제할 번호>>");
				int num = sc.nextInt();
				query = "delete from FRIEND_TB where num = ?";

				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(1, num);
					pstmt.executeUpdate();
					System.out.println("삭제 성공");
				} catch (SQLException e) {
					System.err.println("sql error=" + e);
				}
			} else if (choice == 5) {
				System.out.print("수정 할 친구 번호>>");
				int num = sc.nextInt();

				System.out.print("이름 수정>>");
				String name = sc.next();
				System.out.print("생년월일 수정>>");
				String birthdate = sc.next();

				query = "UPDATE friend_tb SET name = ?, birthdate= ? WHERE num = ?";

				try {
					pstmt = conn.prepareStatement(query);
					pstmt.setInt(3, num);
					pstmt.setString(1, name);
					pstmt.setString(2, birthdate);
					pstmt.executeUpdate();
					pstmt.close();
					System.out.println(num + "번 친구 수정 성공");
				} catch (SQLException e) {
					System.err.println("sql error=" + e);
				}
			} else if (choice == 6) {
				System.out.print("프로그램 종료");
				System.exit(0);
			}
		}
	}
}
