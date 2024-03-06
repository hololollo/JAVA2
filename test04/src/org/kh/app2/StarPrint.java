package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class StarPrint {

	public static void main(String[] args) {
		/*
		 
		 ******
		 ******
		 ******
		 ******
		 
		 */
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/*
		for(int a = 1; a < 6; a++) {
			for(int b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		System.out.println("-----------------");
		for(int a = 6; a >= 0 ; a--) {
			for(int b = 0; b < a; b++) {
				System.out.print("*");
			}
			System.out.println();	
	}
		System.out.println("-----------------");
		
		for(int q = 0; q < 6; q++) { // 줄
			for(int z = 0; z < q; z++) { // 빈칸 개수
				System.out.print(" ");
			}
			for(int z = 6; z > q; z--) { // 별 개수
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("09번. ");
		for(int i = 1; i < 10; i+=2) {
			for(int j = 9; j > i; j-=2) {
				System.out.print(" ");
			}
			for(int j = 0; j < i; j++) {
				System.out.print("*");		// 별이 두개씩 늘어나야함
			}
			System.out.println();
		}
		System.out.println();
	}
}
