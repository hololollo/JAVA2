package org.kh.app2;
// do ~while : 조건이 만족하지 않더라도 1회 이상 실행을 보장하는 문장
public class Loop5 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		do {
			System.out.println(a);
		} while(a > 10);
		
		// 역 for문
		for(int i = 10; i>0; i--) {
			System.out.println(i);
			
		}

		for(;;) { // 무한 루프
			b++;
			System.out.println(b);
			if(b>=10) { // 조건을 걸어서 무한 루프 안되게
				break;
			}
		}
		int total = 0;
		for(int j = 0; j<=100; j++) {
			if(j % 2 == 1) { // 나눴을 때 몫이 1인경우(홀수인경우)는 다음 단을 실행하지 말고 다시 돌아가라. =>짝수만 구할 때
				continue; // 해당 출력을 건너 뛰고(실행 되었다 치고) 다시 다음 for문 실행
			}
			total += j;
		}
		System.out.println(total);
		
		int hap = 0;
		for(int k = 0; k<=100; k+=2) { // k = k + 2 == 2씩 더해라.(짝수의 합) 
			hap+=k; // hap = hap + k
		}
		System.out.println(hap);
	}
}

