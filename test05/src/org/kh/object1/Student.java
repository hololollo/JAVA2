package org.kh.object1;

public class Student {
	
	String name;
	//필드 선언시 기본값을 지정해줄 수도 있다. (default : 문자열(null), 정수(0), 실수(0.0)) 
	int kor = 99;
	int eng = 100;
	int mat = 100;
	
	//접근제어자 : public -> 없으면 default(같은 패키지에서만 사용가능)
	//메서드 선언
	int total() {
		return this.kor + this.eng + this.mat;
	}
	
	double average() {
		return this.kor + this.eng + this.mat / 3.0;
	}
	
	void resulting() {
		System.out.println("이름 : " + this.name + ", 총점 : " + this.total() + ", 평균 : " + this.average());
	}
}