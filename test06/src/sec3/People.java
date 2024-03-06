package sec3;

public class People {
	
	public static int selNum = 100; //고유번호 100으로 디폴트값 지정
	// static : 정적 필드(공유 데이터를 의미) : 객체와 관계없이 메모리가 공유된다.
	public String name;
	public int age;
	public String addr;
	
	public void print1() {
		System.out.println("selnum : " + this.selNum);
		System.out.println("name : " + this.name);
	}
	public static void print2() { // 정적(static)메서드에서는 this 선언 불가능
		System.out.println("Name : 아무개" );
		System.out.println("Age : 28");
	}
	
}