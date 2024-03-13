package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
// 공통적으로 변경점이 없는 것
public class OracleDB {
	Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
	PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
	ResultSet rs = null; // 검색 (select문으로 입력했을 때) 결과를 반환받는 객체 : select문이 아니면 필요가 없음.
	String driver = "oracle.jdbc.driver.OracleDriver"; // oracle.jdbc.driver : 패키지
	String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값은 정해져있다.jdbc:oracle:thin:@localhost:1521:xe
	String userid = "system";
	String userpw = "1234";
	
	public Connection connect() {
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 처리 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}
		return con; // connect 메서드로 담기.(나중에 connect()메서드만 호출하면 알아서 실행될 수 있게)
	}
	
	// 오버라이드 개념 생각하면 쉬움
	public void close(PreparedStatement pstmt, Connection con) { // 2개일 경우(정한대로 호출)
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
	public void close(ResultSet rs, PreparedStatement pstmt, Connection con) { // 3개일 경우(정한대로 호출)
		if(rs != null ) {
			try {
				rs.close();
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
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
}
