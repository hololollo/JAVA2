package sec2;
/*
생성자 오버로드 : 생성자 함수에 매개변수의 종류나 개수에 따라 같은 이름의 생성자를 여러 번 정의.
여러개의 매개변수를 통하여 객체를 생성하게 되면 set메서드를 활용할 필요없이 멤버 필드값을 적용하여 객체를 만들게 됨.
메서드와 차이점 : 반환타입이 없다.
*/
public class OverloadEx3 {

	public static void main(String[] args) {
		Board b1 = new Board(); // 매개 변수 없는 방식으로 b1객체 생성
		b1.setBno(1);
		b1.setTitle("즐거운 자바 코딩~!");
		b1.setAdmin("abc");
		System.out.println(b1.getBno());
		
		Board b2 = new Board(101); // 매개 변수 있는 생성자 방식으로 b2객체 생성
		b2.setTitle("다음 주는 평가대비 해야징~!");
		b2.setAdmin("wolf");
		System.out.println(b2.getTitle());
		System.out.println(b2.getAdmin());


		Board b3 = new Board(102, "오늘은 코딩 불금~!"); 
		b3.setAdmin("walkman");
		System.out.println(b3);

		Board b4 = new Board(103, "주말은 코딩과 함께~!", "kangmh1021");
		System.out.println(b4);

		Notice n1 = new Notice(101, "주말 자바 코딩", "kangmh1021", "자바 내용", "2024-02-23", 11);
		System.out.println(n1.toString());
		
	}

}
