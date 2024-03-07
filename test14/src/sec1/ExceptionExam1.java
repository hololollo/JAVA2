package sec1;
// Failure(고장) : 시스템적인 이상으로 정상적으로 하드웨어나 소프트웨어가 동작하지 못하는 현상
// Error(오류) : 프로그램 작업시에 코드의 문법적 구문 오류, 개발자의 논리적 문장의 실수 등으로 인해 정상적인 작동이 되지 않는 경우로서 정상적인 상태로 돌아 갈 수 없는 것을 의미한다.
//		구문 오류(Syntax Error : 문법오류), 논리 오류(Logical Error), 실행 오류(Run-time Error)
// Exception(예외) : 고장이나 오류와 다르게 개발자의 잘못된 코딩으로 인해 정상적으로 작동이 되지 않는 경우로서 정상적인 상태로 돌아 갈 수 있는 것을 의미한다.
// Mismatch(불일치) : 정상적인 결과와 다르게 결과가 표출되는 것으로 프로그램 코딩 상에 해당 기능이나 구조를 적절한 명령을 하지 않는 경우 발생
// 예외(Exception)처리 : 자바는 윗줄부터 아래로 순서대로 읽어서 반환하기 때문에 윗줄에서 에러가 발생하면 중지하고 아랫줄은 실행조차도 되지 않는다.
// 이러한 경우를 예외(Exception)라고 하며,윗줄에서 에러가 발생하더라도 다음 줄이 실행될 수 있도록 하는 것을 예외 처리라고 한다. 

// 예외의 구분 : IOExeption(데이터 입출력..), RuntimeException(CastException 등등..), SQLException....


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
