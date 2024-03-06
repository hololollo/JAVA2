package org.kh.app2;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		
		int i = 0, total = 0;
		
		/* for와 마찬가지로 조건이 만족하는 동안만 반복수행
		 	그러나 while의 괄호에 조건만 기입하고, 해당 블록 안에 증감식이 기재됨.
		 	변수 선언은 초기식의 while문 시작 전에 해야 함.
		  while(조건식) {
		  	반복할 문장;
		  	
		 */
		while(i<=5) { //값이 true일때 밑 단 실행
			i++; // i = i + 1 없으면 무한루프
			total += i; // total = total + i

		}
		System.out.println("결과 : " + total);
		
		
		//해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하시오.
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력[2-9] : ");
		int dan =scanner.nextInt(); 
		
		int num = 0;		
			while (num < 9) {
				num++;
				System.out.println(dan + " * " + num + " = " + dan * num);
			}	
				
		}
				
 }
