package test02;

import java.util.Scanner;

/*
  문제2.
회원 이름을 입력하고 배열에서 검색하여 해당 회원 이름이 배열에 존재여부를 판단하는 소스코드를 
작성하였지만 오류 발생 및 정상 수행되지 않았다. 
소스코드를 분석하여 원인(문제점+문제 발생 원인), 
조치 내용(해결 방법 + 수정된 코드)을 작성하시오.

	Test2 클래스.png 에 코드 내용이 있음
 */
public class Member {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] memberArr = {"홍길동", "김", "윤웅식", "윤성우", "남궁인"};
		
		System.out.print("검색할 회원 이름을 입력하세요: ");
		String searchName = sc.next();
		
		boolean result = true;
		
		for(int i = 0; i < memberArr.length; i++) {
				if(memberArr[i].equals(searchName)) {
					result = true;
					break;
				} else {
					result = false;
				}
		}
		if (!result) {
			System.out.println("회원이 존재하지 않습니다.");	
		} else {
			System.out.println("회원이 존재합니다.");
		}
	}
}
