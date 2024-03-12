package exam0315.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//이름 목록 작성 : 키보드로 입력받아서 이름목록(nameList)에 추가하되, 
// 입력값이 clear이면 목록을 초기화 하고 처음부터 진행하고 
// 중복된 이름값이 있으면 "이미 존재하는 이름을 표시"하고, 없다면 nameList에 추가저장한다.
// 만약 입력값이 exit이면 입력종료가 되며 현재가지 저장한 이름들을 나열한다.
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String>nameList = new ArrayList<String>();
			
		while(true) {
			System.out.println("추가할 이름을 입력하세요 : ");
			String name = sc.next();
			
			if(name.equals("clear")) {
				continue;
				// System.out.println("이름 목록을 초기화 합니다.");
				// nameList.clear();
				
			}
			if(name.equals("exit")) {
				System.out.println("<<입력 종료>>");
				return; // break;
			}
			if(nameList.contains(name)) {
				System.out.println("<이미 존재하는 이름입니다.>");
			}else {
				System.out.println(name + "추가 완료.");
			}
		}
		/*
		for(String name : nameList) {
			System.out.println(name);
		}
	}*/
}
}