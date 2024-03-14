package edu.kh.test;

import java.util.Arrays;
import java.util.Scanner;
/*
 5개의 주민번호를 입력받아 마스킹 처리 후 배열에 저장한 후 저장된 주민번호를 출력하는 코드를 작성하였으나, 정상적으로 동작하지 않았다.
  아래 소스코드를 확인하여 문제가 발생한 원인과 조치내용(수정된 소스코드) 을 작성하시오.
  
  예상결과
	1번째 주민번호 입력 : 901231-2190087688
	잘못된 주민번호 형식입니다. 다시입력하세요.
	1번째 주민번호 입력 : 901231-2190087
	2번째 주민번호 입력 : 880103-1231981
	3번째 주민번호 입력 : 980821-2908874
	4번째 주민번호 입력 : 020430-6553812
	잘못된 주민번호 형식입니다. 다시입력하세요.
	4번째 주민번호 입력 : 020430-4553812
	5번째 주민번호 입력 : 930723-1273317

--- 주민번호 정보 등록 완료 ---
[901231-2******, 880103-1******, 980821-2******, 020430-4******, 930723-1******]
 */


public class TestController {
	public void test1() {
		Scanner sc = new Scanner(System.in);
		String[] personArr = new String[5];
		for(int i = 0; i < personArr.length; i++) { // 배열에 lenth()라는 메서드는 없다. ()를 없애야 한다.
			System.out.print((i+1)+ "번째 주민번호 입력 : "); // i가 0부터이므로 +1을 해줘서 1번째부터로 고칠 수 있다. 단순히 i번재를 1로 고치게 되면 밑에 배열을 사용할 때 -1을 해줘야 하므로.
			String personId = sc.nextLine(); 
			if((personId.length() == 14)) { // 앞(6자리) + -(1개) + 뒤 (7자리) = 14개
				char gender = personId.charAt(7); // 8번째 문자(인덱스가 7[0부터 시작]인 문자)가
				if(gender == '1' || gender == '2' || gender == '3' || gender == '4') { // 1또는 2또는 3또는 4라면
					personArr[i] = personId.substring(0, 8) + "******"; // // 공백을 제거하고,0번째 글자 '부터' 7번째까지만 추출하여 배열에 저장 ※
				} else {
					System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
					i--; // 을 해줘야 다시 for문으로 돌아갔을때 ++이 되어서 숫자가 증가되는것을 막을 수 있다.	
				}
			} else {
				System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
				 i--; // 을 해줘야 다시 for문으로 돌아갔을때 ++이 되어서 숫자가 증가되는것을 막을 수 있다.
			}
		}
		System.out.println("--- 주민번호 정보 등록 완료 ---");
		System.out.println(Arrays.toString(personArr));
	}
}