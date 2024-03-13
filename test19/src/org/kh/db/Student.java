package org.kh.db;

public class Student { // 항상 DB와 같게 만들어야 한다.
	private int no;
	private String name;
	private int point;
	
	public Student(){}
	public Student(int no, String name, int point) {
		super(); // 있어도 되고 없어도 되고
		this.no = no;
		this.name = name;
		this.point = point;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", point=" + point + "]";
	}
	
	
}
