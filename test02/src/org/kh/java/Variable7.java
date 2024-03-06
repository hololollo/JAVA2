package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {

		String name = "강범준";
		Integer age = 32; // 대문자
		
		String age2 = "32";  // 문자 32
		int age3 = Integer.parseInt(age2) + 8; // 문자32 -> 숫자로 변환
		
		Float height = 177.1f; // 대문자
		String height2 = "177.1";
		float height3 = Float.parseFloat(height2);
		
		// boolean pass = true;
		Double weight = 69.3; // 대문자
		
		System.out.println("타입 확인");
		System.out.println("age : " + age3);
		System.out.println("height : " + height3);
		System.out.println("name = " + name.getClass().getName());
		System.out.println("age = " + age.getClass().getName());
		System.out.println("float = " + height.getClass().getName());
		System.out.println("double = " + weight.getClass().getName());
		// primitive type => Wrapper type = boxing 
		// Wrapper type => primitive type = unboxing


		

	}

}
