package org.kh.site2;
// 대입 연산자 : 연산 후에 대입하는 연산자 : +=, -=, *=, /=, %=, &=, |=, >>=, <<=, >>>=, ^= 
public class Operation7 {

	public static void main(String[] args) {

		int a = 20;
		int b = 15;
		int tmp;
		a += b; // a = a + b (a = 35, b = 15)
		b -= a; // b = b - a (a = 35, b = -20)
		System.out.println("a 와 b의 값은 : " + a + "와" + b);
		// a 와 b의 값을 맞교환
		tmp = a; // c의 역할 : temp값
		a = b;
		b = tmp;
		System.out.println("a 와 b값을 서로 교환");
		System.out.println("a 와 b의 값은 : " + a + "과" + b);
		
		
		int x = 0b01101;
		int y = 0b01011;
		// 2진수로 출력(비트 연산자 : &(and), |(or), ~(not), ^(xor), >>, >>>, <<)
		System.out.println("\nx : " + Integer.toBinaryString(x));
		System.out.println("y : " + Integer.toBinaryString(y));
		
		System.out.println("==============비트 연산자=============");
		System.out.println("\nx & y : " + Integer.toBinaryString(x & y)); // and
		System.out.println("x | y : " + Integer.toBinaryString(x | y)); //or
		System.out.println("x ^ y : " + Integer.toBinaryString(x ^ y)); // xor 입력이 서로 다를경우에만 1값이 나옴.

		System.out.println("~x" + Integer.toBinaryString(~x));
		// not
		
		System.out.println("x >> 2 : " + Integer.toBinaryString(x >> 2));
		// 오른쪽으로 두칸 밀기(나누기 원리)
		
		System.out.println("x << 2 : " + Integer.toBinaryString(x << 2));
		// 왼쪽으로 두칸 밀기 (곱셈 원리)
		
		System.out.println("==============대입 연산자=============");
			
		// 16 8 4 2 1
		int i = 25; // 11001
		int j = 30; // 11110
		i &= j; // i = i & j
		System.out.println("i &= j : " + i); // 11000 -> 24
		
		i = 25; // 11001
		i |= j; // 11110
		System.out.println("i |= j : " + i); // 11111 -> 31

		i = 25; // 11001
		i ^= j; // 11110
		System.out.println("i ^= j : " + i); // 00111 -> 7

		j >>= 2; // 11110 -> 111
		System.out.println("i >>= j : " + j); // 111 -> 7
		
		j = 30;
		j >>>= 2; // 11110 -> 00111
		System.out.println("i >>>= j : " + j); // 111 -> 7
		
		j = 30;
		j <<= 2; // 
		System.out.println("i <<= j : " + j); // 1111000 -> 120

	 
		
		//         ! a+10 > b-5 && c-5 > d + 7
		//우선순위   1  2   3  2  4   2  3   2
		
		
		/*
		 if문
		 if - else if - else
		 if문 연속과 차이점
		 if - else if - else : 한 조건속에서 A가 아니면 B 그것도 아니면 C
		 if - if : 한 조건이 여러번 수행. A라면 첫번째 if문을 수행하고 종료되어야 하는데, 두번째 세번째... 쭉쭉 실행
		 */
		
		
	}

}
