package org.kh.app;

import java.util.Scanner;

//조건문 if~elseif(~else~)
public class Condition3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 스캐너 임포트
		System.out.print("점수 입력[0-100] : "); // 출력문
		
		int point = scanner.nextInt(); // 사용자 입력(정수)
		String result;
		//학점은 점수(point)가 90점 이상이면 'A'이고 80점 이상이면 'B'이고 70점 이상이면 'C'... 'F'
		if (point >= 90) {
			result = "A";
		} else if (point >= 80) {
			result = "B"; 
		} else if(point >= 70) {
			result = "C";
		} else if(point >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println("당신의 점수 : " + point + " 입니다.");
		System.out.println("당신의 등급 : " + result + " 입니다.");
		
		// System.out.printf("\n당신의 등급은 %s 입니다.",result);
		// System.out.printf("\n당신의 점수는 %d점 입니다.",point);
	}
}