package org.kh.object1;
// 클래스에 필드명 선언
public class Person {
	String name;
	int year;
	String gender;
	String job;
	void running() { // void method : return값이 없음.
		System.out.println(this.name + "이 달립니다.");
	}
}
