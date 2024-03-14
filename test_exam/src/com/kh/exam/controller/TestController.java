package com.kh.exam.controller;

import java.util.Arrays;
import java.util.Scanner;

public class TestController {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		String[] personArr = new String[5];
		for(int i = 1; i < personArr.length; i++) { // 배열에 length라는 메서드는 없다. () 없애야 함
			System.out.print(i + "번째 주민번호 입력 : "); // i가 0부터이므로 1로 고쳐야 한다.
			String personId = sc.nextLine();
			if((personId.length() == 14)) { // 문자열(String)은 length메서드를 쓴다.
				char gender = personId.charAt(7); // 8번째까지 아닌 7번째가 되어야 한다.
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') { // char(문자)여서 작은따옴표를 써야한다.
					personArr[i] = personId.substring(0, 8) + "******"; 
				} else {
					System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
				}
			} else {
				System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
			}
		}
		System.out.println("--- 주민번호 정보 등록 완료 ---");
		System.out.println(Arrays.toString(personArr)); 
		// 배열을 조작하고 정렬하는 데 유용한 여러 메서드를 포함(배열 출력: toString() 메서드를 사용하여 배열을 문자열로 출력)
	}
}