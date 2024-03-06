package org.kh.app;
//조건문 다단계 if

import java.util.Scanner;

public class Condition4_ex {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력[0-100] : ");
		
		int point = scanner.nextInt();
		String result;
		String win;
		/*
		 학점은 점수(point)가 
		 97~100 이면 'A++' , 93~96이면 'A0', 90~92이면 'A-'
		 87~89 'B++', 83~86 'B0', 80~82 'B-'
		 77~79 'C++ , 73~76 'C0' 70~72 'C-'
		 67~69 'D++', 63~66 'D0', 60~62 'D-'
		 60점 미만이면 'F'로 하되, 다단계 if와 if/else/else문 활용
		 시상내용은 학점이 'A++'이면 '학업우수상', 'A0' 이면 '노력상'
		 'A-'이면 '아차상'으로 하고, 나머지는 ''으로 하되, swich~case~문 활용
		 */
		if (point >= 97) {
			result = "A++";
			win = "학업우수상";
		} else if (point >= 93) {
			result = "A0"; 
			win = "노력상";
		} else if(point >= 90) {
			result = "A-";
			win = "아차상";
		} else if(point >= 87) {
			result = "B++";
			win = "";
		} else if(point >= 83) {
			result = "B0";
			win = "";
		} else if(point >= 80) {
			result = "B-";
			win = "";
		} else if(point >= 77) {
			result = "C++";
			win = "";
		} else if(point >= 83) {
			result = "C0";
			win = "";
		}else if(point >= 80) {
			result = "C-";
			win = "";
		}else if(point >= 77) {
			result = "D++";
			win = "";
		}else if(point >= 73) {
			result = "D0";
			win = "";
		}else if(point >= 70) {
			result = "D-";
			win = "";
		}else {
			result = "F";
			win = "";
		}
		System.out.println("당신의 점수 : " + point + " 입니다.");
		System.out.println("당신의 등급 : " + result + " 입니다.");
		System.out.println(win);
	}
}
