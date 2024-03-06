package sec1;
// 실행클래스
public class CalcExam {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 4;
		// 구현클래스 메서드를 선언
		// 구현클래스 메서드는 별도의 return값이 없기 때문에 바로 출력 가능.
		Arithmatic a1 = new Arithmatic();
		a1.print();
		System.out.println("원주율 : " + a1.PI);
		System.out.println("덧셈 : " + a1.add(num1, num2));
		System.out.println("뺄셈 : " + a1.subtract(num1, num2));
		System.out.println("곱셈 : " + a1.multiply(num1, num2));
		System.out.println("나눗셈 : " + a1.divide(num1, num2));
		System.out.println("거듭제곱 : " + a1.power(num1, num2));
		
	}

}
