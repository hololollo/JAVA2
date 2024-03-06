package sec1;
// 추상메서드 : 선언만 하고, 구현 내용{asd}을 기술하지 않는다.
public interface Computer { // 인터페이스(interface) : 모든 메서드는 추상 메서드이다.
	// 구현 클래스에서 반드시 interface에서 정의한 매개변수와 반환타입대로 구현 해야 한다.
	void display(); // 기본이 abstract
	void typing();
	void power(boolean sw);
	
	
}
