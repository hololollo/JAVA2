package org.kh.db2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.kh.db.Student;

public class MariaDBExam2 {
	public static void main(String[] args) {
		Student newSt = new Student(6, "kim", 95);
		Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
		PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
		String driver = "org.mariadb.jdbc.Driver"; 
		String url = "jdbc:mariadb://localhost:3308/temp"; // 주소값은 정해져있다. /데이터베이스이름
		String userid = "root";
		String userpw = "1234"; 
		String sql = "insert into student values(?,?,?)"; // ? : 값
		int i = 0; // 단순히 된다면 안된다면을 구분하기 위해 0으로 초기화 시켜줌.
		
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql); // 전원 ON
				pstmt.setInt(1, newSt.getNo()); // 첫번째에 순번 6입력
				pstmt.setString(2, newSt.getName()); // 두번째 이름 입력
				pstmt.setInt(3, newSt.getPoint()); // 세번째 점수 입력
				i = pstmt.executeUpdate(); // 3가지(update, delete, update) => excute3가지();메서드 사용
				// select문과 다른점 : 데이터의 변환(추가)을 일으키기 때문에 commit이 필요하다. executeUpdate에는 commit명령까지 포함되어있다.
				if(i > 0) { // 정상이라면
					System.out.println(i + "건이 성공적으로 처리 되었습니다.");
				}else { // 제대로 입력이 안되서 초기값인 0이 들어간다면
					System.out.println("SQL 구문 연결 실패");
				}
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 처리 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally {
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
