package com.suy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.suy.dto.EmployeesVO;

public class EmployeesDAO {
	private EmployeesDAO() { // Singleton
	}

	private static EmployeesDAO instance = new EmployeesDAO();

	public static EmployeesDAO getInstance() {
		return instance;
	}

	Connection getConnection() {
		Connection conn = null;
		Context initContext;
		try {
			initContext = new InitialContext();
			DataSource ds = (DataSource) initContext.lookup("java:/comp/env/jdbc/orcl");
			conn = ds.getConnection();
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public int userCheck(String userid, String pwd, String lev) {
		int result = 1;
		Connection conn = null;
		String sql = "SELECT * FROM employees WHERE id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				// 비밀번호가 일치하고
				if (pwd.equals(rs.getString("PASS"))) {
					// 회원등급이 일치하면
					if (lev.equals(rs.getString("LEV"))) {
						result = 2; // 관리자로 로그인 성공
						if (lev.equals("B")) {
							result = 3; // 일반회원으로 로그인 성공
						}
					} else { // 레벨 불일치 로그인 실패
						result = 1;
					}
				} else {
					result = 0; // 비밀번호 불일치 로그인 실패
				}
			} else { // 아이디 불일치 로그인 실패
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public EmployeesVO getMember(String id) {
		EmployeesVO member = null;
		Connection conn = null;
		String sql = "SELECT * FROM employees WHERE id=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				member = new EmployeesVO();
				member.setId(rs.getString("ID"));
				member.setPass(rs.getString("PASS"));
				member.setName(rs.getString("NAME"));
				member.setLev(rs.getString("LEV"));
				member.setEnter(rs.getDate("ENTER"));
				member.setGender(rs.getInt("GENDER"));
				member.setPhone(rs.getString("PHONE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return member;
	}
}
