package sec1; // static : 인스턴스를 만들 필요 없음
// 정적 내부 클래스인 Inner 클래스는 외내부 정적 요소만 허용
import sec1.Outer.Inner;

class Outer2 {
	private int num = 10;
	private static int sNum = 20;

	// 인스턴스 내부 클래스
	//public Inner inner; // Outer 생성자를 호출하게 되면, 자동적으로 내부 클래스에 대한 인스턴스 생성
	//public Outer() {
			//inner = new Inner();
		
	//}
	
	// 정적 클래스 - 인스턴스 내부 클래스 생성x
	static class Inner {
		int inNum = 1000;
		static int sInNum = 2000;
		
		void inMethod() {
			System.out.println("내부에서 내부 클래스의 인스턴스 변수 : inNum = " + inNum);
			System.out.println("내부에서 내부 클래스의 정적 멤버 변수 : sInNum = " + sInNum);
			// System.out.println("내부에서 외부 클래스의 인스턴스 변수 : num = " + num); => 인스턴스를 만들지 않았기 때문에.
			System.out.println("내부에서 외부 클래스의 정적 멤버 변수 : sNum = " + sNum);
		}
	}
	// 외부 클래스의 정적 메서드
	static void outMethod() { 
		//System.out.println("외부에서 내부 클래스의 인스턴스 변수 : inNum = " + inNum);
		System.out.println("외부에서 내부 클래스의 정적 멤버 변수 : sInNum = " + Inner.sInNum);
		//System.out.println("외부에서 외부 클래스의 인스턴스 변수 : num = " + num); 
		System.out.println("외부에서 외부 클래스의 정적 멤버 변수 : sNum = " + sNum);
	}
}
public class StaticInnerClassExam {

	public static void main(String[] args) {
		Outer2 out = new Outer2(); // 외부 클래스의 인스턴스
		// out.outMethod(); // static(정적)메서드이므로 객체를 생성하지 않고 실행  
		Outer2.outMethod();
		// Outer2.Inner.inMethod(); // inMethod()는 인스턴스 메서드이므로 정적 클래스인 Inner를 실행할 수 없음.
		// out.Inner.inMethod(); // Inner가 정적 클래스이므로 out인스턴스를 생성하지 않고 Outer2를 활용해야 한다.
		
		Outer2.Inner inner = new Outer2.Inner(); // 정적 내부 클래스의 인스턴스
		inner.inMethod();
		// 외부 클래스에서는 외부 메서드는 모두 실행 가능하다. (내부X) 내부 메서드 및 멤버 변수의 접근 및 실행이 불가능하다.
		// 정적 내부 클래스로 생성된 인스턴스는 내부 메서드 및 멤버 변수의 접근과 실행이 가능하다.
	}

}
