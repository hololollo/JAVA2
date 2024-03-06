package org.kh.site2;
// 논리 연산자 : &&(and), ||(or), !(not)
public class Operation6 {

	public static void main(String[] args) {
		int a = 26;
		int b = 28;
		int c = 27;
		System.out.println("a > b && b > c : " + (a > b && b > c));
		// && : 둘 중 하나라도 거짓이라면 거짓. 둘 다 참이여야 참.
	
		System.out.println("a > b || c > b : " + (a > b || b > c));
		// || : 둘 중 하나라도 참이라면 참. 둘 다 거짓이여야 거짓.

		System.out.println("!(a > b) : " + !(a > b));
		// ! : 아니다, 보통 반대값을 구할 때 사용한다.(true -> false / false -> true)
	}

}
