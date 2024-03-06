package org.kh.object1;

public class StudentEx1 {

	public static void main(String[] args) {
		// 클래스 인스턴스 변수명 = 생성자 클래스 {생략}
		Student kang = new Student();
		
		kang.name = "강범준";
		//변수값 새로 지정 가능.
		kang.kor = 100;
		kang.eng = 100;
		kang.mat = 100;
		
		System.out.println(kang.total());
		
		kang.resulting();
	}

}
