package sec3;

public class Singleton { // 하나의 객체만 생성하는것을 허용
	
	private static Singleton instance; // 정적 객체 선언 
	private Singleton() { // 외부에서 생성 할 수 없도록 private
	}
	public static synchronized Singleton getInstance() { // getIstance() 호출시 생성
		if(instance == null) {
			instance = new Singleton(); // 값이 같다면 instance는 생성자 함수이다.
		}
		return instance;
	}
}
