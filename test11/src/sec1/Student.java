package sec1;

public class Student { // extends Object 기본으로 생략된다. (조상 개념) 그러므로 모든 클래스는 Object 클래스를 시조 클래스. 
	private int sno;
	String name;
	
	public Student () {}
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//복제하려면 clone()을 반드시 오버라이딩
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Student clone = new Student(); // 해당 객체 생성
		clone.name = this.name;			// 새로 생성된 객체에 모든 필드 값을 넘기기
		clone.sno = this.sno;
		return clone;
	}
	
	/*
	// 오버라이딩 안해도 쓸 수 있음.
	// 아래처럼 equals 메서드를 오버라이딩 하게 되면 단순 값을 비교가 가능.
	@Override
	public boolean equals(Object obj) { // Object 매개변수면 모든 값을 다 넣을 수 있음.
		if (obj instanceof Student) {
			Student su1 = (Student) obj;
			if(su1.name == this.name && su1.sno == this.sno) {
				return true;
			} else {
				return false;
			}
		} else {
		return super.equals(obj);
		}	
	}
	*/
}