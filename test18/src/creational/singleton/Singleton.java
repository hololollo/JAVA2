package creational.singleton;

public class Singleton {
	private static Singleton instance; // => static : 멤버 필드(Singleton)는 공유 메모리
	private int msg;
	
	private Singleton(int msg) {
		this.msg = msg;
	}
	public static Singleton getInstance(int msg) { 
		// static -> 객체생성X => Singleton 인스턴스명 = new(X) "Singleton.getInstance(정수)"
		if (instance == null) {
			instance = new Singleton(msg);
		}
		return instance;
	}
	
	public void print() {
		System.out.println(msg);
	}
}
