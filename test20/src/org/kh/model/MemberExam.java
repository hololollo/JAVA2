package org.kh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import section.Member;
	


public class MemberExam {
	Scanner sc = new Scanner(System.in);
	List<Member> MemList = new ArrayList<>();
	
	public static void main(String[] args) {
		MemberExam app = new MemberExam();
		app.mainCall();
		
	}
	public void mainCall() { // 1. 회원 가입, 2. 회원 목록, 3. 회원 삭제, 4. 프로그램 종료
		boolean sw = true;
		while(sw) {
			System.out.println("=== 정보 ===");
			System.out.println("1. 회원 가입");
			System.out.println("2. 회원 목록");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.print("번호 선택 : ");
			switch(sc.nextInt()) {
				case 1:
					Sign();
					break;
				case 2:
					Info();
					break;
				case 3:
					Delete();
					System.out.println("회원정보가 정상적으로 삭제되었습니다.");
					break;
				case 4:
					sw = false;
					System.out.println("프로그램을 종료합니다.");
					break;
				default:
					System.out.println("1 ~ 4번을 입력해주세요.");
					continue;
				}
			}
	}
	public void Sign() {
		System.out.print("회원코드 : ");
		int mcode = sc.nextInt(); //Integer.parseInt(sc.next());
		System.out.print("등록할 회원 아이디 : ");
		String id = sc.next();
		System.out.print("등록할 비밀번호 : ");
		String pw = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("생년월일 : ");				
		int year = sc.nextInt(); //Integer.parseInt(sc.next());
		System.out.print("전화번호 : ");
		String tel = sc.next();
		MemList.add(new Member(mcode, id, pw, name, year, tel));
		System.out.println("회원등록이 완료되었습니다.");
	}
	public void Info() {
		for(Member m : MemList) {
			System.out.println(m.toString());
		}
	}
	// 고유키 값이 될 수 있는 것 : 회원코드, 아이디, 전화번호
	public void Delete() {
		System.out.print("삭제할 회원 코드를 입력하세요 : ");
		MemList.remove(sc.nextInt());
		/*
		System.out.print("삭제할 회원 아이디를 입력하세요 : ");
		String id = sc.next();
		for(int i = 0; i <MemList.size(); i++) {
			if(mem.get(i).getId().equals(id)) {
				System.out.println("해당 정보가 삭제되었습니다.");
				MemList.remove(i);
			}	
		}
		*/
	}
}
