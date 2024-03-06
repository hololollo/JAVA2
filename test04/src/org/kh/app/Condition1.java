package org.kh.app;
// 조건문 if
public class Condition1 {

	public static void main(String[] args) {
		int point = 80;
		String pass = "불합격";
		// 판정(pass)은 점수가 80\\70점 이상이면 "합격" 아니면 "불합격"
		
		// if(point>=70) pass = "합격"; // 조건이 하나면 중괄호 생략 가능
		// System.out.println(pass);
		
		if (point >= 70) {
			pass = "합격";
		}
		System.out.printf("\n당신의 점수는 %d 이며, 판정은 %s입니다.", point, pass);
		
		String pass2 = (point >= 70) ? "합격" : "불합격"; // 삼항 연산자 ? 참 : 거짓
		
		
		
		/*
		if (point >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		*/
		
	}


}
