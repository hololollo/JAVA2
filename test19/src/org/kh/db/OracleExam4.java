package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
// delete from 테이블명 [where 필드명=값] : 테이블의 특정 조건에 맞는 레코드 삭제
public class OracleExam4 {
	public static void main(String[] args) {
		Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
		PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
		String driver = "oracle.jdbc.driver.OracleDriver"; // oracle.jdbc.driver : 패키지
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값은 정해져있다.jdbc:oracle:thin:@localhost:1521:xe
		String userid = "system";
		String userpw = "1234";
		// String sql = "delete from student where name=?"; 
		String sql = "delete from student where no=?"; 
		// String sql = "delete from student where point=?"; 


		// ★ ? : 값, where : 조건
		Student st = new Student(7, "조우진", 94); // 없앨 값을 입력
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, st.getNo());
				// pstmt.setString(1, st.getName());
				// pstmt.setInt(1, st.getPoint());
				i = pstmt.executeUpdate();
				if(i > 0) {
					System.out.println(i + "건이 정상적으로 처리되었습니다.");
				}else {
					System.out.println("SQL 처리 실패");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
