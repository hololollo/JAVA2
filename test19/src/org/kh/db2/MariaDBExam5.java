package org.kh.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.kh.db.Student;

public class MariaDBExam5 {
	public static void main(String[] args) {
		MariaDB maria = new MariaDB();
		Connection con = null; //DB연결을 null값으로 초기화 (try~catch문에 선언했을 때 벗어나면 새로 선언해줘야 하기때문)
		PreparedStatement pstmt = null; // 상태 변경 자동 스위치 전원ON/OFF 하고, SQL의 문장을 실행할 때
		ResultSet rs = null; // 검색 (select문으로 입력했을 때) 결과를 반환받는 객체 : select문이 아니면 필요가 없음.
		String sql = "select * from student";
		List<Student>stList = new ArrayList<>();
		try {
			con = maria.connect(); // 연결
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student(rs.getInt("no"),rs.getString("name"),rs.getInt("point"));
				stList.add(st);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			maria.close(pstmt, con, rs);
		}
		
	}

}
