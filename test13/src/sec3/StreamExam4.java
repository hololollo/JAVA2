package sec3;

import java.util.ArrayList;
import java.util.List;

// class타입의 List Stream 방식 활용 스트림.
class Visitor {
	private String name;
	private int age;
	private int price;
	
	public Visitor() {}
	public Visitor(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Visitor [name=" + name + ", age=" + age + ", price=" + price + "]";
	}
}


public class StreamExam4 {
	public static void main(String[] args) {
		List<Visitor> vList = new ArrayList<>();
		Visitor v1 = new Visitor("강범준", 32, 1000);
		Visitor v2 = new Visitor("아무개", 99, 0);
		Visitor v3 = new Visitor("안철수", 50, 1000);
		Visitor v4 = new Visitor("로보캅", 20, 0);
		Visitor v5 = new Visitor("땡땡땡", 10, 500);
		
		vList.add(v1);
		vList.add(v2);
		vList.add(v3);
		vList.add(v4);
		vList.add(v5);
		
		
		// 메서드 체이닝 .메서드.메서드.메서드 .....
		// Stream<visitor> vStream = vList.stream();
		vList.stream().forEach(vis -> System.out.println(vis.toString())); // 순회 출력
		vList.stream().map(vis -> vis.getName()).forEach(s -> System.out.println(s)); // 이름만 가져와서 출력
		
		System.out.println("나이가 30이상인 사람의 이름을 정렬하여 출력");
		// 조건 검색 : filter()
		vList.stream().filter(vis -> vis.getAge() >= 30) // 30이상인 사람중에서
		.map(c -> c.getName()).sorted() // 이름을 정렬해서
		.forEach(s -> System.out.println(s)); // 순회하여 출력
		// ; 전까지 한 줄로 인식한다.
	}

}
