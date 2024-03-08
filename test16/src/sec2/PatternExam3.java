package sec2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExam3 {
	public static void main(String[] args) {
		String[] email = {"kangmh1021","kangmh1021@naver","kangmh1021@gmail.com","kangmh1021@kr","kangmh1021@daum"};
		
		Pattern p1 = Pattern.compile("[a-z0-9]+@[a-z0-9]+\\.[a-z]+$"); // 이메일 패턴 
		//역슬래시 다음에 일반 문자가 오면 특수문자로 취급하고 역슬래시 다음에 특수문자가 오면 그 문자 자체를 의미

		for(int i = 0; i < email.length;i++) {
			Matcher m = p1.matcher(email[i]);
			if(m.matches()) {
				System.out.println("이메일 형식이 맞습니다.");
				System.out.println(email[i]);
			}
		}
		String[] phone = {"02-1234-1234","010-2836-1004","032-7979-2424","0108284-3690","031-1247-9985"};
		 Pattern p2 = Pattern.compile("010-\\d{3,4}-\\d{4}");  
		 // \d : 0~9 사이의 숫자	/	{n,m} : n개 이상 m개 이하	/	{} : 횟수 또는 범위.(개수)
		 for(int i = 0; i < phone.length;i++) {
				Matcher m = p2.matcher(phone[i]);
				if(m.matches()) {
					System.out.println("휴대폰 번호 형식이 맞습니다.");
					System.out.println(phone[i]);
				}	
				
		}
			String[] jm = {"941207-1234567","010203-6789012","3814255-1234567","851019-234567","780528-1456123"};
			 Pattern p3 = Pattern.compile("\\d{6}-[1-4]\\d{6}");  
			 // \d : 0~9 사이의 숫자	/	{n,m} : n개 이상 m개 이하	/	{} : 횟수 또는 범위.(개수)
			 for(int i = 0; i < jm.length;i++) {
					Matcher m = p3.matcher(jm[i]);
					if(m.matches()) {
						System.out.println("주민번호 형식이 맞습니다.");
						System.out.println(jm[i]);
					}
		 
			 }
			String[] post = {"123-123","212-34","816-24","5434-54","683-39"};
			 Pattern p4 = Pattern.compile("\\d{3}-\\d{3}");  
			 // \d : 0~9 사이의 숫자	/	{n,m} : n개 이상 m개 이하	/	{} : 횟수 또는 범위.(개수)
			 for(int i = 0; i < post.length;i++) {
					Matcher m = p4.matcher(post[i]);
					if(m.matches()) {
						System.out.println("우편번호 형식이 맞습니다.");
						System.out.println(post[i]);
					}
			 }
			 //비밀번호 패턴 : 4~10글자로 영문 대/소문자와 특수문자(!@#$%^&*?_) 그리고 숫자를 모두 최소 1문자를 포함
			 // () : 반드시 포함
			 // ? : 한문자
			 // =. : 이상
			 // * : 뒤에 나오는 조건으로
			 // $ : 끝임을 나타냄.
			 // => (?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10} / 
				String[] pw = {"abcd1234","A123a","1234","ABCD!123456","Abc!432","KIM#1004"};
				 Pattern p5 = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*?_]).{4,10}$");  
				 for(int i = 0; i < pw.length;i++) {
						Matcher m = p5.matcher(pw[i]);
						if(m.matches()) {
							System.out.println("영문 대문자, 소문자, 특수문자, 숫자가 모두 포함된 맞는 비밀번호입니다.");
							System.out.println(pw[i]);
	}
}
	}
}