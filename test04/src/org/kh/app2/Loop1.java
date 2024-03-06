package org.kh.app2;

public class Loop1 {
	// 반복문 : for, while, do~while~
	public static void main(String[] args) {
		int n = 0;
		/*
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		n = n + 1;
		*/
		//for반복문 : 조건이 참일 경우만 반복수행한다.
		//for (초기식;조건식;참일경우 반복수행해야할 증감식 문장){}
		
		for (int i = 0; i < 10; i++) {
			n++; 
			// ++n; , n = n + 1;
			System.out.println("i가 " + i + " 일 때 n은 " + n);
		}
		// 합계 계산

		int [] nums = {80, 95, 75, 60, 100, 65, 70, 90, 85, 95}; // 배열
		String names[] = {"김", "이", "박", "최", "정", "오", "배", "강", "장", "계"};
		int total = 0;
		int max = 0, min = nums[0];
		
		System.out.println();
		System.out.println("이름\t점수\t학점\t판정");

		for (int i = 0; i <10; i++) {
			total += nums[i]; // total = total + nums[i];
			System.out.print(names[i] + "\t");
			System.out.print(nums[i] + "\t");
			
			if (nums[i]>=90) {
				System.out.print("A\t");
			} else if(nums[i]>=80) {
				System.out.print("B\t");
			} else if(nums[i]>=70) {
				System.out.print("C\t");
			} else if(nums[i]>=60) {
				System.out.print("D\t");
			} else {
				System.out.print("F\t");
			}
			
			if(nums[i]>=70) {
				System.out.print("합격\n");
			} else {
				System.out.print("불합격\n");
			} 
			if (nums[i]>max) {
				max = nums[i];
			}
			if (nums[i]<min) {
				min=nums[i];
			}
		}		
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + (double)total / 10);
			System.out.println("최대 점수 : " + max);
			System.out.println("최소 점수 : " + min);
	}
}