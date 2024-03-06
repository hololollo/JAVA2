package sec1;

public class Product {
	private String pname;
	private int pcode;
	private int price;
	private int size;
	private int amount;
	private String remark;
	
	// 메서드 오버로드 {<-> 상속(오버라이드) : 특정 메서드를 상속 받아 실행 할 내용을 다른값으로 출력}
	// 다형성
	public void print() {
		System.out.println("제품정보");
	}
	public void print(String pname) { // 매개변수의 타입이나 변수에 따라서 같은이름을 여러번 쓸 수 있다.
		System.out.println("제품이름 : " + pname);
	}
	public void print(int amount) { // 
		System.out.println("제품수량 : " + amount);
	}
	public void print(String pname, int amount) { 
		System.out.println(pname);
		System.out.println(amount);		
	}
	public void print(int amount, String pname) { 
		System.out.print(pname);
		System.out.println(amount);		
	}
	
	// getter, setter 
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override // toString
	public String toString() {
		return "Product [pname=" + pname + ", pcode=" + pcode + ", price=" + price + ", size=" + size + ", amount="
				+ amount + ", remark=" + remark + "]";
	}
	
	

}
