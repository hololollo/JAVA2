package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// update(수정) 테이블명 set 필드명 1=갑1[, 필드명2=값2, 필드명3=값3] [where 필드명=값] : 테이블 데이터에서 특정 조건에 맞는 레코드를 변경한다.
public class OracleExam3 {
	public static void main(String[] args) {
		Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
		PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
		String driver = "oracle.jdbc.driver.OracleDriver"; // oracle.jdbc.driver : 패키지
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값은 정해져있다.jdbc:oracle:thin:@localhost:1521:xe
		String userid = "system";
		String userpw = "1234";
		String sql = "update student set point=?, name=? where no=?"; // 필드가 연속되면 , where절 전에는 , 를 사용하지 않는다.
		// update는 거꾸로.   ★ ? : 값, where : 조건
		Student st = new Student(3, "김종우", 89); // 바꿀 값을 입력
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getPoint()); // 주의! 첫번째가 포인트다.
				pstmt.setString(2, st.getName());
				pstmt.setInt(3, st.getNo());
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
