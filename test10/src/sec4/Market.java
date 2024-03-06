package sec4;
// 인터페이스 : 다중상속 가능 -> 서로 다른 인터페이스를 특정 클래스에서 다중 상속받아서 사용할 수 있다. 
// 클래스 : 다중상속 불가능 -> 하나를 제일 위로두고 점차적으로 설정
public class Market implements Buy, Sell{

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}
	
}
