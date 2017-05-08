
//DAO에 해당하는 클래스
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBMgr {
	DBCon conn;

	public DBMgr() {
		conn = new DBCon();
	}

	public ArrayList<AdminBean> login() {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<AdminBean> list = new ArrayList<>();
		String sql = "SELECT * FROM admin";
		AdminBean bean;
		try {
			con = conn.getConnetion();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				bean = new AdminBean();
				bean.setId(rs.getString("id"));
				bean.setPw(rs.getString("pw"));
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e4) {
				e4.printStackTrace();
			}
		}
		return list;
	}

	public ArrayList<BKBean> allBk() {
		Connection con = null; // 내 pc의 db에 접속
		Statement stmt = null; // db에 sqldmㄹ 적을 수 있는 판을 만든다.
		ResultSet rs = null; // sql한 결과를 담는 그릇을 만든다.
		ArrayList<BKBean> list = new ArrayList<>();
		String sql = "SELECT * FROM lib";

		try {
			con = conn.getConnetion();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				BKBean bean = new BKBean();
				bean.setLib_name(rs.getString(1));
				bean.setLib_code(rs.getString(2));
				bean.setLib_price(rs.getString(3));
				bean.setLib_author(rs.getString(4));
				bean.setLib_publisher(rs.getString(5));
				bean.setLib_state(rs.getString(6));
				list.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				// 연결을 유지해야하므로 con은 닫으면 안된다.
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public ArrayList<BKBean> insertBk(String code, String title, String price, String author, String publisher,
			String state) {
		Connection con = null; // 내 pc의 db에 접속
		Statement stmt = null; // db에 sql을 적을 수 있는 판을 만든다.
		PreparedStatement pstmt = null;
		ResultSet rs = null; // sql 한 결과를 담는 그릇을 만든다.
		ArrayList<BKBean> list = new ArrayList<>();
		String sql = "INSERT INTO lib values(?,?,?,?,?,?)";

		try {
			con = conn.getConnetion();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, code);
			pstmt.setString(3, price);
			pstmt.setString(4, author);
			pstmt.setString(5, publisher);
			pstmt.setString(6, state);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				// con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public ArrayList<BKBean> searchBk(String title) {
		Connection con = null; // 내 pc의 db에 접속
		Statement stmt = null; // db에 sql을 적을 수 있는 판을 만든다.
		ResultSet rs = null; // sql 한 결과를 담는 그릇을 만든다.
		ArrayList<BKBean> list = new ArrayList<>();
		String sql = "SELECT * FROM lib WHERE lib_name = '" + title + "'";

		try {
			con = conn.getConnetion();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				BKBean bean = new BKBean();
				bean.setLib_name(rs.getString(1));
				bean.setLib_code(rs.getString(2));
				bean.setLib_price(rs.getString(3));
				bean.setLib_author(rs.getString(4));
				bean.setLib_publisher(rs.getString(5));
				bean.setLib_state(rs.getString(6));
				list.add(bean);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				// con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public void deleteBk(String code) {
		Connection con = null; // 내 pc의 db에 접속
		Statement stmt = null; // db에 sql을 적을 수 있는 판을 만든다.
		PreparedStatement pstmt = null;
		ArrayList<BKBean> list = new ArrayList<>();
		String sql = "DELETE FROM lib WHERE lib_code = ?";

		try {
			con = conn.getConnetion();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, code);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				// con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
