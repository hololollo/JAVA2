package org.kh.site;
//비교 연산자
public class Operation5 {

	public static void main(String[] args) {
		
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan + "단 * " + i + " =" + dan * i);
			}
		}
		
		int a = 25;
		int b = 28;
		int c = 27;
		
		System.out.println("a와 b가 같습니까?" + (a == b));
		System.out.println("a와 b가 다릅니까?" + (a != b));
		System.out.println("a가 b보다 큽니까?" + (a > b));
		System.out.println("b가 c보다 크거나 같습니까?" + (b >= c));
		System.out.println("a가 b보다 작습니까?" + (a < b));
		System.out.println("b가 c보다 작거나 같습니까?" + (b <= c));
		
		if (a == b) {
			System.out.println("true");
		}
			else {
				System.out.println("false");
		}
	}

}



