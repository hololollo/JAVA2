package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.db.Student;

public class MariaDBExam1 {
	public static void main(String[] args) {
		Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
		PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
		ResultSet rs = null; // 검색 (select문으로 입력했을 때) 결과를 반환받는 객체 : select문이 아니면 필요가 없음.
		String driver = "org.mariadb.jdbc.Driver"; 
		String url = "jdbc:mariadb://localhost:3308/temp"; // 주소값은 정해져있다. /데이터베이스이름
		String userid = "root";
		String userpw = "1234"; 
		String sql = "select * from student"; 
		// 오라클과 비교해서 달라지는건 driver, url, userid, sql
		List<Student> stList = new ArrayList<>();
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while(rs.next()) {
					Student st = new Student(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
					stList.add(st);
				}
			} catch (SQLException e) {
				System.out.println("오류");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("오류");
			e.printStackTrace();
		}finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
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
		for(Student s : stList) {
			System.out.println(s.toString());
		}
	}

}
