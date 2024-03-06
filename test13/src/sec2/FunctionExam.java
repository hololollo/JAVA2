package sec2;
//함수(메서드) 정의와 사용 방법
//메서드 기술
class met1 {	// 매개변수 X, 반환 X
	void method1() { 
		int x = 100, y = 200;
		System.out.println(x + y);
	}
}
class met2 {	// 매개변수 O, 반환 X
	void method2(int x, int y) {
		System.out.println(x + y);
	}
}
class met3 {	// 매개변수 X, 반환 O
	int method3() {
		int x = 100, y = 200;
		return x + y;
	}
}
class met4 {	// 매개변수 O, 반환 O
	int method4(int x, int y) {
		return x + y;
	}
}

public class FunctionExam {

	public static void main(String[] args) {
		//메서드(Method) : 특정 클래스에 멤버로 규정되어 있어, 객체.메서드명(값) 으로 출력
		System.out.println("\n메서드");
		met1 met1 = new met1();
		met1.method1();
		
		met2 met2 = new met2();
		met2.method2(100, 200);
		
		met3 met3 = new met3();
		System.out.println(met3.method3());
		
		met4 met4 = new met4();
		System.out.println(met4.method4(100, 200));
		
		System.out.println("\n함수");
		fnc1();
		fnc2(100, 200);
		System.out.println(fnc3());
		System.out.println(fnc4(100, 200));
	}
	
	// 함수 : main 클래스에서 사용(하나의 클래스에서만 사용할 수 있다. <-> 메서드 차이점)
	public static void fnc1() { // 매개변수X, 반환 X
		int x = 100;
		int y = 200;
		System.out.println(x + y);
	}
	public static void fnc2(int x, int y) { // 매개변수O, 반환 X
		System.out.println(x + y);
	}
	public static int fnc3() { // 매개변수X, 반환 O
		int x = 100, y = 200;
		return x + y;
	}
	public static int fnc4(int x, int y) { // 매개변수O, 반환 O
		return x + y;
	}
}
