package exam;

@FunctionalInterface
interface calc {
	public int add(int num1, int num2); 
}
public class Exam5 {
	public static void main(String[] args) {
		calc c1 = (int num1, int num2) -> {
			return num1 + num2;
		}; // 구현체로 만들기 위해서 반드시 ;
		System.out.println(c1.add(100, 200));
		
	}

}
