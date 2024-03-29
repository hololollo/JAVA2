package exam;

import java.util.ArrayList;
import java.util.List;

class Book {
	private String name;
	private int price;
	
	
	public Book(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + "]";
	}
	
	
}



public class Exam7 {

	public static void main(String[] args) {
		List<Book>bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 15000));
		bookList.add(new Book("안드로이드", 30000));
		
		// 1. 모든 책의 가격의 합
		System.out.println("총 금액 : " + bookList.stream().mapToInt(a -> a.getPrice()).sum());
		
		// 2. 책의 가격이 20000원 이상인 책의 이름을 정렬하여 출력
		bookList.stream().filter(b -> b.getPrice() >= 20000) // 20000원 이상인 책을 골라서
		.map(c -> c.getName()).sorted() // 이름을 정렬하고 
		.forEach(s -> System.out.println("20000원 이상인 책 : " + s)); // 하나씩 맞는지 확인하여(순회하여) 출력
	}
}
