package org.kh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// select (값이 입력된 상태를 불러오는 것) select 필드명1[, 필드명2, 필드명3,... 또는 *] from 테이블명 [where 필드명=값] : 테이블에서 [특정 조건에 만족하는] 레코드를 검색
public class OracleExam1 {
	public static void main(String[] args) {
		Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
		PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
		ResultSet rs = null; // 검색 (select문으로 입력했을 때) 결과를 반환받는 객체 : select문이 아니면 필요가 없음.
		String driver = "oracle.jdbc.driver.OracleDriver"; // oracle.jdbc.driver : 패키지
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 주소값은 정해져있다.jdbc:oracle:thin:@localhost:1521:xe
		String userid = "system";
		String userpw = "1234";
		String sql = "select * from student";
		List<Student> stList = new ArrayList<>(); // Student의 객체를 담을 수 있는 목록을 설정
		
		try {
			Class.forName(driver); // 현재 클래스에 오라클 드라이버를 가져와라.(드라이버 로딩)
			try {
				con = DriverManager.getConnection(url, userid, userpw); // 데이터베이스 물리적 연결(운용하기 위한 드라이버 설치)
				pstmt = con.prepareStatement(sql); // 데이터베이스 논리적 채널 연결
				rs = pstmt.executeQuery(); // 실행(객체들이 메모리 상에 떠있는 상태) ★단순히 실행만.(데이터가 변경될 일이 없다.)
				while(rs.next()) { // 데이터 건수가 몇건인지 모를때는 while문이 적합하다.(rs의 데이터가 계속 실행되면~)
					Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point")); // 데이터베이스의 테이블과 같게 
					stList.add(st); // st객체의 목록 추가
				}
					
			} catch (SQLException e) {
				System.out.println("데이터베이스 연결 실패 또는 SQL 구문 실행 실패");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} finally { // 데이터베이스 닫기
			if(rs != null) { // != null : 열려있지 않은경우(null로 초기화했기 때문)
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
		} // 열린 순서의 역순으로 닫았다.
		for(Student s : stList) {
			System.out.println(s.toString()); // 객체 정보
		}
		
	}

}
