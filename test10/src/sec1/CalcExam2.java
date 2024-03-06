package sec1;

public class CalcExam2 {
	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 3;
		
		// 인터페이스 cal1 선언
		Calcurator cal1;
		
		//구현 내용이 기술되어 있지 않으므로 추상체로는 객체를 생성할 수 없음
		//cal1 = new Calcurator();
		//cal1 = new Repeator();
		
		//인터페이스 cal1을 구현클래스 생성자로 형 변환 선언.
		cal1 = new Arithmatic();
		
		//cal1은 Calcurator로 선언되어 있으므로 Calcurator에 print() 메소드가 없으므로 실행 불가
		//cal1.print(); -> 인터페이스 Calcurator를 상속받는 Repeator 추상 클래스 를 상속받는 Arithmatic 구현클래서 에서 추가 선언하였다.
		//따라서 가장 윗대가리인 인터페이스와 구현클래스의 교집합(서로 같은 부분)만 출력 가능하다. 
		//만약 그냥 구현클래스를 선언했으면 print(); 메서드 선언이 가능. 
		System.out.println("원주율 : "+cal1.PI);
		System.out.println("덧셈 : "+cal1.add(num1, num2));
		System.out.println("뺄셈 : "+cal1.subtract(num1, num2));
		System.out.println("곱셈 : "+cal1.multiply(num1, num2));
		System.out.println("나눗셈 : "+cal1.divide(num1, num2));
		//cal1은 Calcurator로 선언되어 있으므로 Repeator 추상클래스에서 추가 선언한 power() 메소드가 없으므로 실행 불가
		//System.out.println("거듭제곱 : " + cal1.power(num1, num2));
		
		//그러므로 조상 인터페이스로 선언되어 자식 클래스의 생성자로 생성된 인스턴스(객체)는
		//조상 인터페이스의 선언된 메소드만 사용할 수 있으며, 실행되는 내용은 
		//자식 클래스에서 기술한 내용대로 실행된다.
		
		//인터페이스 => 클래스 : implements(구체화 == 구현화)
		//클래스 => 클래스 : extends(확장) {클래스-클래스} {인터페이스-인터페이스}
		//인터페이스 => 인터페이스 : extends(확장)
	}
}