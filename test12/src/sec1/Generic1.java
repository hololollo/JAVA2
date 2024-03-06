package sec1;
// 제네릭이란 ?(범용) => 데이터와 관계없이 여기저기 아무거나 모두 받아서 처리하는 클래스 -> 자바 1.5이상 지원
// 자주 사용하는 타입 인자 : T(Type), E(Element), K(Key), V(Value), N(Number), R(Result)
public class Generic1<T> { // 참조형 끼리 값을 다 바꾸고 싶을 때 <> 다이아몬드 연산자
	private T field1;

	public Generic1() {
	}
	public Generic1(T field1) {
	super();
	this.field1 = field1;
	
	
	}
	public T getField1() {
		return field1;
	}
	public void setField1(T field1) {
		this.field1 = field1;
	}
	
	
	
}
