package sec1;

public class AbstractExam1 {

	public static void main(String[] args) {
		// User u1 = new User(); 
		// User : 추상클래스 추상 메서드의 구현내용이 기술되어 있지 않아 사용하려면 connect 메서드를 기술하여 구현해야 함.
		
		User u1;
		u1 = new Member();
		u1.setIp("192.168.1.152");
		u1.setPort(80);
		u1.connect();
		
		u1 = new Staff();
		u1.connect();
		
		Member u2;
		u2 = new Member();
		u2.setIp("192.168.0.121");
		u2.setPort(80);
		u2.setId("kang");
		u2.setPw("1234");
		u2.connect();
		
		Staff u3;
		u3 = new Staff();
		u3.setIp("192.168.0.164");
		u3.setPort(80);
		u3.setLevel(2);
		u3.setPart("기술부");
		u3.setName("강범준");
		u3.connect();
		
	}

}
