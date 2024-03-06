package sec1;

public class AnimalExam1 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Mammal(); // 부모 클래스 안에 자식 생성자 함수 선언
		Animal a3 = new Birds(); // 부모 클래스 안에 자식 생성자 함수 선언
		
	// 자식 클래스로 부터 선언된 객체는 부모 또는 형제 생성자를 활용하여 객체 생성 불가능..
		Mammal m2 = new Mammal(); // 자식 클래스에 자식 생성자 함수 선언 가능
		// Mammal m3 = new Birds();  형제 클래스 끼리는 선언 불가능.
		
		Animal a4; // 선언
		a4 = new Animal(); // Animal 객체 생성
		a4.setName("구렁이");
		a4.setSpine(true);
		a4.print();
		
	
		a4 = new Mammal(); // Mammal 객체로 형 변환
		// a4.setWings(0); // 선언된 class는 Animal class 때문에..
		// a4.setleg(2);
		a4.setName("호랑이");
			System.out.println(a4.print());
		
		a4 = new Birds(); // Birds 객체로 형 변환
		// a4.setWings(0); // 선언된 class는 Animal class 때문에..
		a4.setName("갈매기");
		System.out.println(a4.print());
		
		// 메서드 오버라이딩 : 부모 클래스로 부터 상속받은 메서드를 다르게 구현
		// 부모 클래스로 선언된 객체는 부모 또는 자식 생성자를 활용하여 다양하게 형 변환 할 수 있다. -> 다형성
		// 클래스 -> 캡슐화, 정보은닉, 재사용성, 다형성, 추상화
	}		
}
