package sec2;

import java.io.Console;
import java.io.IOException;

public class ConsoleExam {
	public static void main(String[] args) throws IOException{
		Console con = System.console();
		
		System.out.print("이름 : ");
		String name = con.readLine(); // 입력대기 모드가 없어서 예외발생(NullPointerException). => Console보다 scanner를 더 많이 이용하는 이유
		
		System.out.println("점수 : ");
		int point = Integer.parseInt(con.readLine());
		
		System.out.println("체중 : ");
		double weight = Double.parseDouble(con.readLine());
		
		System.out.println("비밀번호 : ");
		char[] pwc = con.readPassword(); // .readPassword(); => char[]타입
		String pw = new String(pwc); // 문자 배열을 문자열로 형 변환
		
		Person p = new Person(name, point, weight);
		System.out.println(p.toString());
		System.out.println("비밀번호 : " + pw);
	}

}