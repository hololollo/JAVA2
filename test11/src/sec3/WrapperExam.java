package sec3;

public class WrapperExam {

	public static void main(String[] args) {
		// int a; // 기본타입(선언만 -> 오류)
		// Integer a; // 참조타입(선언만 -> 오류)
		int a = 10; // 10으로 초기화
		Integer b = a; // 참조형 타입선언(참조형에 기본형 데이터 대입 => Wrapping, Boxing 이라고 한다.)
		int c = b; // 기본형에 참조형 데이터 대입(UnWwap, UnBoxing)
		/*
		 Boxing : 기본형은 멤버를 가질 수 없으므로 해당 타입의 메서드나 필드가 없기 때문에
		 참조형으로 변경하여야 여러 필요한 정보를 확인하고, 그 타입의 메서드를 사용할 수 있어야 하므로
		 해당 타입의 관련 메서드를 사용하기 위해서는 기본형을 참조형으로 바꾸어야 한다.
		 그러므로, 기본타입에 관련된 Boxing(Wrapping)을 하여 참조형으로 변경 할 수 있는
		 클래스를 Wrapper 클래스라고 한다.
		// boolean <=> Boolean : Boxing, UnBoxing
		// byte <=> Byte : Boxing, UnBoxing
		// char <=> Character : Boxing, UnBoxing
		// short <=> Short : Boxing, UnBoxing
		// int <=> Integer : Boxing, UnBoxing
		// long <=> Long : Boxing, UnBoxing
		// float <=> Float : Boxing, UnBoxing
		// double <=> Double : Boxing, UnBoxing
		 */
		 
		// System.out.println("a = " + b instanceof Integer); => 오류, instanceof는 wrapper타입이 아닌곳에서 사용
		System.out.println("문자열 10을 Integer(정수) 타입의 10으로 변경 = " + Integer.valueOf("10"));
		String d = "10";
		System.out.println("문자열 10을 Integer(정수) 타입의 10으로 변경 = " + Integer.valueOf(d));
		System.out.println("문자열 10을 Byte(절대값) 타입의 10으로 변경 = " + Byte.valueOf(d));
		String e = "3.14";
		// double f = (double) e; => 오류(기본형 타입)
		System.out.println("문자열 10을 Double(실수) 타입의 10으로 변경 = " + Double.valueOf(e));


		
	}

}
