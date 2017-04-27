import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.naming.spi.DirStateFactory.Result;

public class ScoreDAO {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/java";
	private static final String USER = "root";
	private static final String PASS = "1234";

	public Connection getConn() {
		Connection conn = null;

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASS);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public int insertScore(ScoreDTO dto) { // return값을 boolean으로 하는게 낫지않을까
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			conn = getConn();
			String sql = "insert into score values(?,?,?,?,?,?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getKor());
			ps.setInt(3, dto.getEng());
			ps.setInt(4, dto.getMath());
			ps.setInt(5, dto.getTot());
			ps.setInt(6, dto.getAvg());
			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}
		}
		return result;
	}

	public Vector getScore() {
		Vector data = new Vector();
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = getConn();
			String sql = "select * from score order by name asc";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("name");
				int kor = rs.getInt("kor");
				int eng = rs.getInt("eng");
				int math = rs.getInt("math");
				int tot = rs.getInt("tot");
				int avg = rs.getInt("avg");
				Vector row = new Vector();
				row.add(name);
				row.add(kor);
				row.add(eng);
				row.add(math);
				row.add(tot);
				row.add(avg);
				data.add(row);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}

	public int deleteScore(ScoreDTO dto) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			conn = getConn();
			String sql = "delete from score where name=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}

	public int updateScore(ScoreDTO dto) {
		Connection conn = null;
		PreparedStatement ps = null;
		int result = 0;

		try {
			conn = getConn();
			String sql = "update score set kor=?, eng=?, math=?, tot=?, avg=? where name=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getKor());
			ps.setInt(2, dto.getEng());
			ps.setInt(3, dto.getMath());
			ps.setInt(4, dto.getTot());
			ps.setInt(5, dto.getAvg());
			ps.setString(6, dto.getName());
			result = ps.executeUpdate();
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return result;
	}
}
