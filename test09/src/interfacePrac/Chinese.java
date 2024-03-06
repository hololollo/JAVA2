package interfacePrac;

public class Chinese implements Lunch{

	@Override
	public void eating(String menu) {
		System.out.println("중식 :" + menu + "을 먹습니다.");
	}
	

}
