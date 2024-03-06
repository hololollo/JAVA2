package sec1;

public class CalcExam5 {

	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 3;
		
		Repeator rep;
		rep = new Repeator() {
			/*
			public int add(int num1, int num2) { // 덧셈
				return num1 + num2;
			}
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
			*/
			public int multiply(int num1, int num2) { // 곱셈
				return num1 * num2;
			}
			public int divide(int num1, int num2) { // 나눗셈
				int su = 0;
				if ( num1 > num2) {
					su = num1 / num2;
				} else {
					su = num2 / num1;
				}
				return su;
			}
			int power(int num1, int num2) { // 제곱(num1^num2) => ex) 2, 3
				int tmp = num1;
				for(int i = 1; i < num2; i++) {
					num1 = num1 * tmp;
				}
				return num1;
			}
		};
		/*
		System.out.println("원주율 : "+rep.PI);
		System.out.println("덧셈 : "+rep.add(num1, num2));
		System.out.println("뺄셈 : "+rep.subtract(num1, num2));
		*/
		System.out.println("곱셈 : "+rep.multiply(num1, num2));
		System.out.println("나눗셈 : "+rep.divide(num1, num2));
		System.out.println("거듭제곱 : " + rep.power(num1, num2));
	}

}
