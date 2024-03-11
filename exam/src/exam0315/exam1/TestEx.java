package exam0315.exam1;

import java.util.ArrayList;
import java.util.List;

public class TestEx {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>(); // ArrayList

	        list.add(4);
	        list.add(-5);
	        list.add(0);
	        list.add(-3);
	        list.add(2);
	        list.add(1); // + 한개를 출력하기 위해서 정수 1을 추가한다.
	        // list.add(1.23456); // Integer 타입 실수 불가능

	        for (int num : list) {
	            char ch;
	            if (num < 0) { // 0과 같다를 0보다 작다로 고쳐야 한다.
	                ch = '-';
	            } else if (num > 0) {
	                ch = '+';
	            } else {
	                System.out.println("#############");
	                // 현재 코드에서는 num이 0인 경우에만 "#############"을 출력하도록 되어 있습니다.
	                // 0이 아닌 경우에도 출력하려면 다음과 같이 수정할 수 있습니다:
	                continue;
	            }
	            // int Math.abs(정수) : 정수의 절대값을 반환
	            for (int i = 1; i <= Math.abs(num); i++) {
	                System.out.print(ch);
	            }
	            System.out.println();
	       }
	   }
}
