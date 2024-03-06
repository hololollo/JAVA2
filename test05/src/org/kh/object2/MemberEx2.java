package org.kh.object2;

import org.kh.object1.Member; // ★패키지가 달라지면 자동으로 생성? -> 오브젝트1 멤버 클래스에 내포되어있다.★

public class MemberEx2 {

	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("kang");//mem1.id = "kang";
		mem1.setPw(1234);//mem1.pw = 1234;
		mem1.setEmail("kangmh1021@gmail.com");//mem1.email = "kangmh1021@gmail.com";
		mem1.setBirth(1992);//mem1.birth = 1992;
		mem1.setTel("01089603255");//mem1.tel = "01089603255";
		
		System.out.println("id : " + mem1.getId());
		System.out.println("pw : " + mem1.getPw());

		System.out.println(mem1.toString());
	}

}
