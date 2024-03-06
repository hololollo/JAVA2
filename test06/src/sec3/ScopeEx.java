package sec3;
// Scope : 특정 변수가 영향을 미치는 범위
public class ScopeEx {
	int a = 10; // 전역(Global scope)변수 -> 클래스 전체에서 인지되는 변수, 특정 메서드(함수) 내에서는 인지 못함.
	static int b = 100; //클래스 변수 -> 특정 메서드(함수) 내에서도 인식 가능.
	
	public static void main(String[] args) { // 실행은 main함수
		int a = 20; // 지역변수 : 특정 메서드(함수 내에서)만 인식 가능. 외부에서 사용 불가능.
		System.out.println("main 내부 지역변수 : " + a);
		run();
		run(30);
		} // main함수 종료
	
	public static void run() {
		int c = 40;
		System.out.println("클래스 변수 b : " + b);
	}
	public static void run(int a) { // 매개변수 : 메서드(함수) 정의시 괄호 안에 있는 변수로 호출될 때 지정된 값을 저장한다.
		System.out.println("매개변수 a : " + a);
	}	

}
