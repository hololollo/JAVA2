package sec3;

import java.io.IOException; // system.in.read();

public class ScheduleExam {

	public static void main(String[] args) throws IOException { // 에러날 때 건너뛰기
		
		//키보드로 알파벳[A-Z]를 입력받아 입력 값이 'R' 이면 RoundRobin의 객체가
		// 'P'이면 PriorityAllocation의 객체가
		//'L'이면 LeastJob의 객체가 생성되고
		// 그밖의 문자가 입력되면 "지원하지 않는 스케줄링입니다."가 출력될 수 있게 해 주세요.
		
		Scheduler s = null;
		System.out.print("전화 상담 방식 선택 : ");
		int ch = System.in.read(); // ☆한 글자만 입력할 때 스캐너 사용하지 않고
		/*
		switch(ch) {
		case 'R' :
		case 'r' :
			s = new RoundRobin();
			break;
		case 'P' :
		case 'p' :
			s = new PriorityAllocation();
		case 'L' :
		case 'l' :
			s = new LeastJob();
		default :
			System.out.println("지원하지 않는 스케줄링입니다.");
		}
		*/
		if(ch=='R' || ch =='r') {	// 문자열 : "" / 한개 문자 : ''
			s = new RoundRobin();
		} else if (ch=='P' || ch =='p') {
			s = new PriorityAllocation();
		} else if (ch=='L' || ch =='l') {
			s = new LeastJob();
		} else {
			System.out.println("지원하지 않는 스케줄링입니다.");
		}
		
		s.getNextCall();
		s.sendCallToAgent();
		
	}

}
