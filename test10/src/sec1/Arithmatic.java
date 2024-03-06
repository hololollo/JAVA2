package sec1;
// Repeator 추상클래스를 상속받는 Arithmatic 구현 클래스
// Calcurator 인터페이스에서 선언한 메서드를 Repeator 추상클래스에서 일부만 오버라이딩 하였고
// 이를 Arithmatic 클래스에서 나머지 추가 오버라이딩.
// 추가로 Repeator 클래스에서 추가선언 한 추상메서드를 추가 오버라이딩. 
public class Arithmatic extends Repeator{

	@Override
	int power(int num1, int num2) { // 제곱(num1^num2) => ex) 2, 3
		int tmp = num1;
		for(int i = 1; i < num2; i++) {
			num1 = num1 * tmp;
		}
		return num1;
	}

	@Override
	public int multiply(int num1, int num2) { // 곱셈
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) { // 나눗셈
		int su = 0;
		if ( num1 > num2) {
			su = num1 / num2;
		} else {
			su = num2 / num1;
		}
		return su;
	}
	
	public void print() {
		System.out.println("계산기, 중계기, 연산기, ");
	}

}
