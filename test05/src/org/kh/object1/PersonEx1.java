package org.kh.object1;

public class PersonEx1 {

	public static void main(String[] args) {
		// person 이라는 클래스에서 kang이라는 인스턴스를 사용.
		// new : 생성자 (); -> 함수생략
		Person kang = new Person(); // PersonEx1 클래스에서 Person 클래스의 인스턴스를 생성(객체화)
		kang.name = "강범준";
		kang.year = 1992;
		kang.gender = "남성";
		kang.job = "개발자";
		
		System.out.println(kang.year);
		kang.running();
		
		
		// String name;
		// Person lee = new Person();

		// lee.running();  -> 빈값(클래스는 참조이기 때문에 오류로 표기하지 않고 null값이 출력)
		// System.out.println(name + "이 달립니다."); -> 기본형이기 때문에 null값 오류출력
	}

}
