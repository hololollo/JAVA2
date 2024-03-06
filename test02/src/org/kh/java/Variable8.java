package org.kh.java;

public class Variable8 {

	public static void main(String[] args) {
		var num1 = 29.456; // 타입 동적 할당 : 자료형과 무관하게 해당하는 리터럴(값)
		var num2 = 34;
		var num3 = 'k';
		var num4 = "강범준";
		var num5 = true;
		
		num1 = 67; // int 타입으로 변경되나 소숫점 자리수는 그대로 유지. integer.parseInt()로 변경시키면 딱 맞게.
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);
		System.out.println("num5 = " + num5);
		

	}

}
