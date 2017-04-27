
//DAO에 해당하는 클래스
import java.sql.Connection;
import java.sql.ResultSet;
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
}
