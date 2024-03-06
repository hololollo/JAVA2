package org.kh.java;

public class Variable6 {

	public static void main(String[] args) {
		float f1 = 3.14f;
		double f2 = 3.18; 
		int kor = 90, eng = 80, mat = 90;
		double average = (double)(kor + eng + mat) / (double)3;
		// float average = (kor + eng + mat) / 3.0f;
		System.out.printf("\nf1 = %f", f1);
		System.out.printf("\nf2 = %.1f", f2); // 절삭 / 버림처리가 아닌 반올림 처리된다.
		System.out.printf("\n평균 = %.2f", average);
		
	}

}
