package exam0315.exam1;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
	public static void main(String[] args) {
		List<Integer>list = new ArrayList<>(); // ArrayList
		
		list.add(4);
		list.add(-5);
		list.add(0);
		list.add(-3);
		list.add(2);
		// list.add(1.23456); // Integer 타입 실수 불가능
		
		for(int num : list) {
			char ch;
			if(num <= 0) {
				ch = '-'; // 5개
			}else if(num > 0) {
				ch = '+'; // 4개, 2개, 1개
			}else {
				System.out.println("#############"); // 28개
				continue;
			}
			//int Math.abs(정수) : 정수의 절대값을 반환
			for(int i = 1; i < Math.abs(num); i++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		
		
	}
}
