package org.kh.object1;

public class MemberEx1 {

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
