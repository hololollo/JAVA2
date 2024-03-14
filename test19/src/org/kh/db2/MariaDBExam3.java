package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.db.Student;

public class MariaDBExam3 {
	
// MariaDB의 temp데이터베이스의 student 테이블 3번 학생의 데이터를 UpdSt의 내용으로 레코드가 변경될 수 있도록 자바 프로그래밍을 완성하시오.
	
	public static void main(String[] args) {
		Student updSt = new Student(3, "park", 88); // 바꿀 값을 입력
		Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
		PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
		String driver = "org.mariadb.jdbc.Driver"; 
		String url = "jdbc:mariadb://localhost:3308/temp"; // 주소값은 정해져있다. /데이터베이스이름
		String userid = "root";
		String userpw = "1234"; 
		String sql = "update student set point=?, name=? where no=?"; // ? : 값
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, updSt.getPoint()); // 주의! 첫번째가 포인트다.
				pstmt.setString(2, updSt.getName());
				pstmt.setInt(3, updSt.getNo());
				i = pstmt.executeUpdate();
				if(i > 0) {
					System.out.println(i + "건이 정상적으로 처리되었습니다.");
				}else {
					System.out.println("SQL 처리 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터 베이스 연결 실패 도는 SQL 처리 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}finally {
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
}
