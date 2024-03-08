package sec1;

import java.time.LocalDate;
import java.util.Date;

// Date : 문자열로 취급
public class DateExam {
	public static void main(String[] args) {
		Date date1 = new Date();
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1992, 9, 21, 14, 27, 00); // 연 월 일 시 분 초  
		// 월 표기 : -1해야 한다.(0부터 시작하기 때문) / 취소선 : 지금은 되지만 나중엔 안될 수도 있다는 뜻
		
		@SuppressWarnings("deprecation")
		Date date3 = new Date("Fri Oct 21 1992 14:27:00 + 0900"); 
		// +0900 : RFC 822 규격 타임존 (그리니치 기준 0000 일때 대한민국은 +0900)
		// 지역 이름(Global / Local) : KST(korea standard), RFC 822 : +0900
		// 국가 코드 : KR, 언어 코드 : KO => KO_KR
		System.out.println(date1); // 현재 날짜와 시간
		System.out.println(date2); 
		System.out.println(date3); 
		
		System.out.println("*** LocalDate ***");
		// 날짜 데이터
		LocalDate now1 = LocalDate.now();
		System.out.println(now1); 
		
		// 날짜 데이터 => 문자열 데이터
		String now2 = now1.toString();
		
		// 문자열 데이터 => 날짜 데이터
		LocalDate now3 = LocalDate.parse(now2);
	}

}
