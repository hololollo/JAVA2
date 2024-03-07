package sec1;
// NullPointerException : 출력 할 문장이 있는 기억장소가 비어있는경우
public class ExceptionExam2 {

	public static void main(String[] args) {
		String name = null;
		int data; // 초기화 안하고 선언만.
		//실제 처리할 문장(try)이 예외가 발생하면, 예외처리 문장(catch)을 실행 1. NullporinterException 변수.printStackTrace();  2. Exception
		
		// 다중 catch 문장
		try { // 실제 처리할 문장
			System.out.println(name.toString()); 
			System.out.println("정상 처리 문장 아래");
		} catch(NullPointerException e) { // 예외가 발생할 경우 처리할 문장
			e.printStackTrace(); //	java.lang.NullPointerException 출력
			name = "강범준";
			System.out.println(name + "\n예외 처리 문장 아래");
			//System.out.println("알 수 없는 예외가 발생하였습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생하였습니다.");
		}
	}
}