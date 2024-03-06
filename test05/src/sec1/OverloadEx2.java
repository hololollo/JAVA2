package sec1;

public class OverloadEx2 {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		
		b1.setBno(101);
		b1.setBname("정보처리 기사");
		b1.setPrice(42000);
		b1.setAuthor("강범준");
		b1.setPub("한빛미디어");
		
		Book b2 = new Book();
		b2.setBno(102);
		b2.setBname("자바프로그래밍 입문");
		b2.setPrice(25000);
		b2.setAuthor("강범주운");
		b2.setPub("이지스퍼블리싱");
		
		Book b3 = new Book();
		b3.setBno(103);
		b3.setBname("HTML / CSS");
		b3.setPrice(28000);
		b3.setAuthor("강범주우운");
		b3.setPub("정보문화사");
		
		Book b4 = new Book();
		b4.print();
		System.out.println();
		b4.print(b1.getBname(), b1.getPrice(), b1.getAuthor(), b1.getPub());
		System.out.println();
		b4.print(b2.getBname(), b2.getPrice(), b2.getAuthor());
		System.out.println();
		b4.print(b3.getBname(), b3.getPrice(), b3.getAuthor());

	}
}
