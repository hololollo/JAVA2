package org.kh.object1;

public class Compute01 {
	
	
	void fnc1() { // 반환X, 매개변수X
		System.out.println("메서드1");
	}
	void fnc2(int a) { // 반환X, 매개변수O
		System.out.println(a + "를 입력하셨습니다.");
	}
	int fnc3() { // 반환o, 매개변수X
		return 1004;
	}
	String fnc4(int point) { // 반환o, 매개변수O
		if(point>=80) {
		 return "합격";
		} else {
			return "불합격";
		}
	}
}
