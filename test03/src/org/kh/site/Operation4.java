package org.kh.site;
//증감 연산 
public class Operation4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		
		System.out.println("전위 증가 연산 : " +(++a)); // a를 먼저 1씩 증가시키고 난 후에 출력
		System.out.println("전위 감소 연산 : " +(--a));  
                                                     
		System.out.println("후위 증가 연산 : " +(b++)); // b를 먼저 출력하고, 나중에 1씩 증가시킨다. 
		// (실제 해당 라인의 출력값은 10, 다음 라인의 실제 값은 11)
		System.out.println("후위 감소 연산 : " +(b--));
		// (실제 해당 라인의 출력값은 11, 다음 라인의 실제 값은 10
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);


	}

}
