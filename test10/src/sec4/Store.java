package sec4;
//다중 상속 불가능.

public class Store extends Pay {

	@Override
	public void pay() {
		System.out.println("상점");
		super.pay(); // 부모클래스 : super클래스
	}

	@Override
	public void inverntory() {
		System.out.println("상점");
		super.inverntory();
	}
	
}
