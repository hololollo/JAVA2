package sec2;

//변수 연산자 제어문 클래스 쪽지시험
public class Student {
	
	private String name;
	private int grade;
	private int money;
	
	// top-down
	public Student() {
		this("강범준");
	}
	public Student(String name) {
		this(name, 100);
	}
	public Student(String name, int grade) {
		this(name, grade, 10000);
	}
	//source - Contructor using fields
	public Student(String name, int grade, int money) {
		this.name = name;
		this.grade = grade;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//클래스 타입도 매개변수로 받을 수 있다.
	//학생이 버스를 타면 생기는 현상
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void print() {
		System.out.println("Student [name=" + name + ", grade=" + grade + ", money=" + money + "]"); 
	}

	//학생이 지하철을 타면 생기는 현상
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	public void print1() {
		System.out.println("Student [name=" + name + ", grade=" + grade + ", money=" + money + "]"); 
	}
}
