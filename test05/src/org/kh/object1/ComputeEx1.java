package org.kh.object1;
// 메서드 : 정의 -> 호출
public class ComputeEx1 {

	public static void main(String[] args) {
		//메서드
		Compute01 comp1 = new Compute01();
		comp1.fnc1(); // 메서드 호출,  반환X, 매개변수X
		comp1.fnc2(100); // void 사용으로 return(반환)값 이 없어 바로 출력되는 형태, 반환X, 매개변수O
		
		System.out.println(comp1.fnc3());
		// int a = comp1.fnc3();  comp1.fnc3()에 1004를 반환한다.
		// System.out.println(a);
		
		String pass = comp1.fnc4(75); // 75 -> Compute01클래스에서의 int point의 매개변수값
		System.out.println(comp1.fnc4(75)); // -> return 값 "합격", "불합격"
		System.out.println(pass); // pass -> return 값 "합격", "불합격"
		
		//함수
		fnc1();
		fnc2(200);
		System.out.println(fnc3());
		System.out.println("원의 넓이 : " + fnc4(25));
		
	}
		//함수(Function) : 정의 호출
		public static void fnc1() { // static 정적 : 
			System.out.println("반환X, 매개 변수x");
		}
		public static void fnc2(int a) {
			System.out.println("반환X, 매개 변수o" + a);
		}
		public static int fnc3() {
			return 500; // 반환O, 매개 변수X
		}
		public static double fnc4(int radius) { // 반지름
			return radius * radius * 3.1415; // 반환o, 매개 변수o 
		}
}
