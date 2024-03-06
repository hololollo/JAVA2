package org.kh.app;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력[0-100] : ");
		
		int point = scanner.nextInt();
		String result;
		if (point >= 90) {
			result = "A";
		}
		if (point >= 80) {
			result = "B";
		}
		if (point >= 70) {
			result = "C";
		}
		if (point >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println("당신의 점수 : " + point + " 입니다.");
		System.out.println("당신의 등급 : " + result + " 입니다.");

	}
}
