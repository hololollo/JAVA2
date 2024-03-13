package org.kh.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam5 {
	public static void main(String[] args) {
		//select
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from student";
		OracleDB oracle = new OracleDB();
		List<Student> stList = new ArrayList<>();
		try {
			con = oracle.connect(); // OracleDB클래스의 .connect()메서드 가져와 con으로 명명
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 결과를 받아와서
			while(rs.next()) { // next가 있을 때까지 실행
				Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point")); 
				// Student 객체에 각각 순서대로 입력
				stList.add(st);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			oracle.close(rs, pstmt, con); // close()메서드를 가져옴.
		}
		for(Student s : stList) {
			System.out.println(s.toString());
		}
		
		// insert
		con = null; // 중복선언은 안되니까 초기화
		pstmt = null;
		int i = 0;
		Student std = new Student(8, "배곤희", 95); // try~catch문에 선언했었기 대문에 새롭게 작성해야 한다.
		sql = "insert into student(name, no, point) values(?,?,?)"; 
		// 순서가 같다면 (no, name, point) 생략 가능. 여기서는 순서 변경했기 때문에 작성해줘야 한다.
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, std.getName()); // 순서 중요!
			pstmt.setInt(2, std.getNo()); // 중복되면 안된다(기본키) -> 두번 실행하면 중복되기때문에 SQL 처리 실패 출력.
			pstmt.setInt(3, std.getPoint());
			i = pstmt.executeUpdate();
			if(i > 0) {
				System.out.println(i + "건이 정상적으로 처리되었습니다.");
			}else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		}finally {
			oracle.close(pstmt, con);
		}
		
		
		
		// update
		con = null;
		pstmt = null;
		i = 0;
		std = new Student(6, "고대신", 100);
		sql = "update student set name=?, point=? where no=?";
			
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getPoint());
			pstmt.setInt(3, std.getNo());
			i = pstmt.executeUpdate();
			if(i > 0) {
				System.out.println(i + "건 처리 성공");
			}else {
				System.out.println("SQL처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		}finally {
			oracle.close(pstmt, con);
		}

	
	//delete
	con = null;
	pstmt = null;
	i = 0;
	// std = new Student(4, "권민지", 97);
	int bun = 4; // 4번 데이터를 지운다.
	sql = "delete from student where no=?";

	try {
		con = oracle.connect();
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, bun);
		i = pstmt.executeUpdate();
		if(i > 0) {
			System.out.println("삭제 성공");
		}else {
			System.out.println("SQL 처리 실패");
		}
	} catch (SQLException e) {
		System.out.println("SQL 구문 오류");
		e.printStackTrace();
	}finally {
		oracle.close(pstmt, con);
	}
	
}
}
