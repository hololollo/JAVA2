package sec1;

public class Book {
	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	
	//method overload : 같은 이름의 메서드 여러개를 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
	public void print() { //  
		System.out.println("교재 정보");
	}

	public void print(String bname) {
		System.out.println("교재명" + bname);
	}
	
	public void print(int price) {
		System.out.println("교재가격" + price);
	}
	
	public void print(String bname, int price) {
		System.out.println("교재명" + bname);
		System.out.println("교재가격" + price);
	}
	
	public void print(String bname, int price, String author) {
		System.out.println("교재명" + bname);
		System.out.println("교재가격" + price);
		System.out.println("작가" + author);
	}

	public void print(String bname, int price, String author, String pub) {
		System.out.println("교재명 : " + bname);
		System.out.println("교재가격 : " + price);
		System.out.println("작가 : " + author);
		System.out.println("출판소 : " + pub);		
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	
	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
				+ "]";
	}
	
	
	
}
