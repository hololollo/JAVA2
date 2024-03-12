package exam0315.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String>nameList = new ArrayList<String>();
		
		while(true) {
			System.out.println("추가할 이름을 입력하세요 : ");
			String name = sc.next();
			
			if(name.equals("clear")) {
				System.out.println("이름 목록을 초기화 합니다.");
				nameList.clear();
				continue; //초기화 후 반복문을 계속 실행
			}
			if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				break; 
				// 반복문 종료 return 대신 쓰는 이유 : return은 메소드를 즉시 종료 시키고 호출한 곳으로 반환하여 프로그램을 완전히 종료해버린다. 
				// break : 반복문을 종료하고 반복문 이후의 코드를 실행한 뒤 계속해서 프로그램이 실행된다. (또 다른시점에서 프로그램이 종료된다.)
			}
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다.>");
			}else {
				System.out.println(name + "추가 완료.");
				nameList.add(name);
			}
		}
		
		System.out.println("등록된 이름 목록 : ");
		for(String name : nameList) {
			System.out.println(name);
		}
	}

}
