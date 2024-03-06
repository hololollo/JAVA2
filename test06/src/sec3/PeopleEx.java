package sec3;

public class PeopleEx {

	public static void main(String[] args) {
		People p1 = new People();
		People.selNum = 200; // p1.selNum = 200; -> 클래스필드(정적필드) == 공유 데이터
		p1.name = "강범준"; // 인스턴스 변수 (동적할당(필드))
		p1.age = 32;
		p1.addr = "경기도";
		System.out.println(p1.selNum + "," + p1.name);
		
		People p2 = new People();
		People.selNum = 300; // p2.selnum = 300;
		p2.name = "아무개";
		p2.age = 33;
		p2.addr = "서울";
		System.out.println(p2.selNum + "," + p2.name);
		
		p1.selNum = 400;
		System.out.println(p1.selNum + "," + p1.name);
		System.out.println(p2.selNum + "," + p2.name);

		p1.print1();
		p2.print1();
		
		p1.print2(); // static메서드 사용시 기울임꼴
		p1.print2(); // People.print2();
		
		//정적(static) 요소 : static으로 선언된 필드 또는 메서드, 객체 생성없이 활용 가능
		//정적(static)메서드 : 객체의 생성없이 해당하는 클래스에서 바로 활용하는 메서드
		System.out.println(); // -> (정적 메서드 == 클래스 메서드)
		People.print2(); // -> p1이라는 객체 없이 people클래스에서 바로 사용
		People.selNum = 500;
	}

}
