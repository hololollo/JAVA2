package sec1;
//내부클래스 : 클래스 안에 더 작은 클래스
class Outer { // 외부 클래스
	private int num = 10; //멤버필드
	private static int sNum = 20; // 정적 멤버필드 => 데이터 공유목적
	
	// 인스턴스 내부 클래스
	public Inner inner; // Outer 생성자를 호출하게 되면, 자동적으로 내부 클래스에 대한 인스턴스 생성
	public Outer() {
			inner = new Inner();
	}
	
	class Inner { // 내부 클래스
		int inNum = 1000;
		
		void inMethod() {
			System.out.println("내부 클래스에서 외부 클래스의 멤버 : num" + num);
			System.out.println("내부 클래스에서 외부 클래스의 정적 멤버 변수 접근 : sNum" + sNum);
		}
	}
	public void outMethod() { // 외부 클래스에서 내부 클래스의 메서드를 호출
		inner.inMethod(); // inner class에 있다는 것을 표시해 줘야 한다.
		
	}
}
public class InnerClassExam {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.outMethod(); // 타 클래스에서 객체 생성 후 외부 클래스의 멤버 메서드 호출
		out.inner.inMethod(); // 타 클래스에서 객체 생성 후 inner클래스의 멤버 메서드 호출 : ★한단계 거쳐서★ 
	}

}
