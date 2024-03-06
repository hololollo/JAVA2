package sec1;

public abstract class Repeator implements Calcurator{
	//인터페이스로 부터 상속 받은 추상 클래스는 전부 또는 일부만 추상화 할 수 있다.
	// 물려받은 메소드에 대하여 구현이 가능하다.
	// 별도의 추상 메소드도 새롭게 정의할 수 있음.
	@Override
	public int add(int num1, int num2) { // 덧셈
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) { // 뺄셈
		int su = 0;
		if(num1 > num2) {
			su = num1 - num2;
		} else if (num1 == num2) {
			su = 0;
		} else if(num1 < num2) {
			su = num2 - num1;
		} else {
			su = ERROR;
		}
		return su;
	}	
	abstract int power(int num1, int num2); // 추상 메서드 추가 선언
}
