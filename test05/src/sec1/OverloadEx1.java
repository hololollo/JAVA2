package sec1;

public class OverloadEx1 {

	public static void main(String[] args) {
		Product pro1 = new Product();
		
		pro1.print();
		pro1.print("아무개");
		
		pro1.print(500);
		pro1.print("범준봇", 300);
		pro1.print(150,"아무개");
		
	}

}
