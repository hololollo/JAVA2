package sec1;

import java.text.SimpleDateFormat;
import java.util.Date;

//SimpledateFormat : 날짜 표시형식을 지정할 때 활용하는 클래스
public class DateFormatExam {
	public static void main(String[] args) {
		//날자 데이터
		Date today = new Date();
		
		//표시형식 코드 : y-년, M(대문자)-월, d-일, hh-시, m(소문자)-분, s-초, E-요일, a-오전/오후, W(대문자)-월 중 주차, w(소문자)-연 중 주차
		SimpleDateFormat fmt1 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat fmt2 = new SimpleDateFormat("yyyy-03-dd hh:mm:ss");
		SimpleDateFormat fmt3 = new SimpleDateFormat("오늘날짜 : yyyy년 MM월 dd일(E), 현재시각 : a hh시 mm분");
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy년 M월 W번째 주");
		
		//날짜 데이터에서 특정 표시형식이 부여된 문자열 데이터로 변환
		String t1 = fmt1.format(today);
		String t2 = fmt2.format(today);
		String t3 = fmt3.format(today);
		String t4 = fmt4.format(today);
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
	}

}
