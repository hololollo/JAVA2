package org.kh.java;

public class Variable1 {

	public static void main(String[] args) {
		boolean a = true;  //논리형(true, false) : 1byte
		byte b = 126;	// -128~127 -> 256   (127을 넘게되면 오버플로우 발생, 오류가 발생해서 -128이 입력된다.
	//  byte b = -129;  -> -128보다 작은 수로 언더플로우 발생
	//  byte = 1byte => 8bit => 256가지(~128~127)
		short c = 32767; // 2byte = 16bit = 65536(-32768~32767)
		char d = 'k';  // 2byte
		int e = 234567; // 4byte 21억 미만
		float f = 3.14f; // 4byte
		long g = 210000000L; // 8byte 21억 이상
		double h = 3.14; // 8byte
		System.out.println("byte : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short : " + Short.MAX_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("Character : " + Character.MAX_VALUE + "~" + Character.MAX_VALUE);
		System.out.println("int : " + Integer.MAX_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("float : " + Float.MAX_VALUE + "~" + Float.MAX_VALUE);
		System.out.println("long : " + Long.MAX_VALUE + "~" + Long.MAX_VALUE);
		System.out.println("double : " + Double.MAX_VALUE + "~" + Double.MAX_VALUE);
	}

}
