package exam0315.exam1;

import java.util.ArrayList;
import java.util.List;

public class TestEx {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>(); 
		 // 원인 : List는 인터페이스(추상체)이기 때문에 ★선언만 가능하고, ★객체생성이 불가능하며 참조도 불가능하다. ★nullpointerException이 발생한다.★
		 // ArrayList로서 객체로 생성해야한다. 

	        list.add(4);
	        list.add(-5);
	        list.add(0);
	        list.add(-3);
	        list.add(2);
	        list.add(1); // 결과 : + 한개를 출력하기 위해서 정수 1로 변경한다.
	        // list.add(1.23456); // 원인 : List 선언시 요소의 데이터 타입이 Integer로 설정되어 있어서 정수만 입력받을 수 있으므로(실수 불가능) 타입 오류가 발생
	        // 반드시 reperence타입으로 사용(Integer)

	        for (int num : list) {
	            char ch;
	            if (num < 0) { // 원인 : 조건식 오류 : ★if문 조건에서 0을 포함하여 음수라고 표현했으므로 0이어도 음수가 발생하고, 0인경우 정상적으로 처리되어야 할 else문이 실행되지 않는 오류 발생.★(알고리즘 오류) 
	            	// 0과 같다를 0보다 작다로 고침으로서 조건문의 else부분에서 num값이 0일때 #####이 정상적으로 출력될 수 있도록 수정해야 한다.
	                ch = '-';
	            } else if (num > 0) {
	                ch = '+';
	            } else {
	                System.out.println("#############"); // 원인 : 결과값이 ##### 인데, 입력은 @@@@으로 되어있다.
	                continue;
	            }
	            // int Math.abs(정수) : 정수의 절대값을 반환
	            for (int i = 1; i <= Math.abs(num); i++) { 
	            	// 원인 : int i가 1부터로 선언되어있고, for 반복문의 실행 조건이 해당 숫자를 포함하는 것이 아니여서. 
	            	// 		 즉, 해당 숫자를 포함하여 ch가 이어서 출력되어야 하는데 num이 i보다 크다고 설정되어있어 해당 숫자보다 한번씩 덜 출력되게 설정되어있다. 
	            	// 해당 숫자만큼 횟수가 출력되어야 하기 때문에 크거나 같다고 표현(i <= Math.abs(num); )해야 정상적으로 출력된다.
	                System.out.print(ch);
	            }
	            System.out.println();
	       }
	   }
}
