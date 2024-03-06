package sec1;

public class Exam1 {

	public static void main(String[] args) {
		int a = 1004;
		int b = 1004;
		
		System.out.println("a == b" + (a == b)); // 값은 같으나 주소는 다름. (단순 변수의 정수 값 비교)
		// 문자형은 equals
		String s1 = "강범준"; // String 기본형X, 참조형X
		String s2 = "강범준"; // 기본형X, 참조형X
		
		System.out.println("s1 == s2 : " + (s1 == s2)); //틀린 문자열의 값 비교 ★★★★★
		System.out.println("s1 equals s2 : " + (s1.equals(s2))); // 맞는 문자열의 값 비교 -> String 클래스 연산을 해야 하므로 반드시 equals
		
		Integer c = new Integer(1004); // 이렇게 써도 무방. // Integer 참조형(로그인화면 구성 등)
		Integer d = 1004;  // 참조형
		System.out.println("a == c : " + (a == c)); // 기본형과 참조형 비교는 값비교.
		System.out.println("c == d : " + (c == d)); // 참조형과 참조형 비교는 주소비교.
		System.out.println("c equals d : " + (c.equals(d))); // 참조형의 비교는 equals로 해야 값을 비교한다.
		
		
	}

}
