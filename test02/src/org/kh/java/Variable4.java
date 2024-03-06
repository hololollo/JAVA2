package org.kh.java;

public class Variable4 {

	public static void main(String[] args) {
		String name = "강범준";
		String name1 = "\'강범준\'";
		short age = 32;
		float height = 177.1f;
		double weight = 69.3;
		char init = 'k';
		System.out.println("이름 = \"" + name + "\"");
		System.out.println("이름 = " + name1);
		System.out.printf("%n이름 = \" %s \"", name);
		System.out.printf("%n나이 = %d", age);
		System.out.printf("%n키 = %f", height);
		System.out.printf("%n몸무게 = %.3f", weight); // .3 : 소숫점 3자리까지 출력
		System.out.println("\n이니셜 : " +init);

		/* 
		 스프링, 스프링부트, 프레임워크에서 특히나 사용유의
		 이스케이프 문자
		 \n : 줄 바꿈
		 \t : tap
		 \\ : \ 자체를 출력
		 \' : '를 출력 \"로 해도 무방하다.
		 */
		
		
	
	}

}
