package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MariaDB {
	//필드 선언
	Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
	PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
	ResultSet rs = null; // 검색 (select문으로 입력했을 때) 결과를 반환받는 객체 : select문이 아니면 필요가 없음.
	String driver = "org.mariadb.jdbc.Driver"; 
	String url = "jdbc:mariadb://localhost:3308/temp"; // 주소값은 정해져있다. /데이터베이스이름
	String userid = "root";
	String userpw = "1234"; 
	
	public Connection connect() {
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void close(PreparedStatement pstmt, Connection con) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public void close(PreparedStatement pstmt, Connection con, ResultSet rs) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
