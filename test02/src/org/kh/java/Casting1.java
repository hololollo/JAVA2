package org.kh.java;
//형 변환1(Auto Casting, Force Casting = type conversion)
public class Casting1 {

	public static void main(String[] args) {
		//작은 단위에서 큰 단위로 형 변환 가능. 반대로는 불가능.
		// 작은 크기의 저장소에 있는 데이터 값을 큰 크기의 저장소로 옮겨져서 형 변환 되는 것을 오토 캐스팅이라고 한다.
		byte b = 20;
		short s = b;
		int i = s;
		long l = i;
		
		// 큰 크기의 저장소에 있는 데이터 값을 별도의 타입 연산자를 활용하여 강제로 형 변환(명시적 형 변환)
		// 데이터의 정확성을 보장할 수 없다.
		int i2 = (int) l;
		short s2 = (short) i;
		
		int a = 10;
		double b1 = 2.0;
		int sum = a + (int)b1;
		
		System.out.println(sum);
		
		char c1 = '\uae00'; 
		System.out.println(c1);
		
		
	}

}
