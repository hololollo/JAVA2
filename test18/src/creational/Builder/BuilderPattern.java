package creational.Builder;
//BuilderPattern : 멤버 필드와 같은 구성원을 하나 하나 쌓아 올려 객체를 생성하는 패턴
class Student {
	 int no;
	 String name = "홍길동";
	 int point = 0;
	 String phoneNumber = "010-0000-0000";
	 public Student() {}
	 public Student(int no, String name, int point, String phoneNumber) {
		super();
		this.no = no;
		this.name = name;
		this.point = point;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber + "]";
	}
	 
	 
}

class StudentBuilder extends Student {
	private int no;
	private String name;
	private int point;
	private String phoneNumber;
	// getter, setter말고 체이닝이 될 수 있도록
	public StudentBuilder no(int no) {
		this.no = no;
		return this;
	}
	public StudentBuilder name(String name) {
		this.name = name;
		return this;
	}
	public StudentBuilder point(int point) {
		this.point = point;
		return this;
	}
	public StudentBuilder phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}
	public Student build() { // ★★★
		return new Student(no, name, point, phoneNumber);
	}
	@Override
	public String toString() {
		return "StudentBuilder [no=" + no + ", name=" + name + ", point=" + point + ", phoneNumber=" + phoneNumber
				+ "]";
	}
	
	
}
public class BuilderPattern {
	public static void main(String[] args) {
		Student st1 = new StudentBuilder().no(1001).name("강범준").point(80).phoneNumber("010-8960-3255").build();
		// StudentBuilder를 이용한 Student 객체 생성, 메서드 체이닝 -> 해당 멤버를 하나 씩 메서드 체이닝 방법에 의해 추가하는 객체 생성 방식
		System.out.println(st1.toString());
		
		Student st2 = new StudentBuilder().no(1002).build(); // 본인이 원하는 값만 빼올 수 있다. 입력하지 않은 값은 기본값으로.
		System.out.println(st2.toString());
		
		Student st3 = new StudentBuilder().no(1003).name("강범준").build(); // 본인이 원하는 값만 빼올 수 있다. 입력하지 않은 값은 기본값으로.
		System.out.println(st3.toString());

		Student st5 = new Student(1005, "강범준", 80, "010-8960-3255");
		// 생성자에 의한 객체 생성
		System.out.println(st5.toString());
	}

}
