package org.kh.app2;

import java.util.Random; // main 생성자 새로 추가(util)

public class Loop7 {

	public static void main(String[] args) {
		//1부터 45까지 무작위 숫자가 나올 수 있도록 로또 추첨기를 만들어주세요.
		int min = 1, max = 45;
		Random r = new Random(); // 난수 출력 util 
		for(int i = 0; i <= 6; i++) {
			int val = r.nextInt(max + min) + min; // int i 를 1로 선언해도 0이 나올 수 있다.
			System.out.print(val + "\t");

		}
	}
}
