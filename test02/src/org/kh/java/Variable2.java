package org.kh.java;

public class Variable2 {

	public static void main(String[] args) {

		byte b = 10;
		short s = 20;
		int i; // 값이 없으면 null 오류, java는 한줄씩 읽기 때문에 위에서 오류가 발생하면 그 즉시 종료되고 밑에 오류는 확인하지 않는다.
		long l; // 선언(O), 초기화(X) => 그냥 출력시 오류. 
		
		i = 30; // 초기화
		l = 40L; // 초기화 (L을 붙이지 않으면 int형으로 계산 된다.)
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);

		// b = 130; -> 오버플로우
		// b = -130; -> 언더플로우

	}

}
