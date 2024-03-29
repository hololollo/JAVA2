package sec2;

import java.util.Scanner;

class Person {
	private String name;
	private int point;
	private double weight;
	
	public Person() {}
	public Person(String name, int point, double weight) {
		super();
		this.name = name;
		this.point = point;
		this.weight = weight;
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
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", point=" + point + ", weight=" + weight + "]";
	}
	
	
}

public class ScannerExam {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scn.next();
		
		System.out.print("점수 입력 : ");
		int point = scn.nextInt();
		
		System.out.print("몸무게 입력 : ");
		double weight = scn.nextDouble();
		
		Person p = new Person(name, point, weight);
		System.out.println(p.toString());
	}

}
