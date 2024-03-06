package sec1;
// 예외(Exception)처리 : 자바는 윗줄부터 아래로 순서대로 읽어서 반환하기 때문에 윗줄에서 에러가 발생하면 중지하고 아랫줄은 실행조차도 되지 않는다.
// 이러한 경우를 예외(Exception)라고 하며, 위줄에서 에러가 발생하더라도 다음 줄이 실행될 수 있도록 하는 것을 예외 처리라고 한다. 
public class ExceptionExam1 {
	public static void main(String[] args) {
		String name = null;
		int data; // 초기화 안하고 선언만.
		//실제 처리할 문장(try)이 예외가 발생하면, 예외처리 문장(catch)을 실행
		try { // 실제 처리할 문장
			System.out.println(name.toString()); 
		} catch(Exception e) { // 예외가 발생할 경우 처리할 문장
			System.out.println("알 수 없는 예외가 발생하였습니다.");
		}
	}

}
