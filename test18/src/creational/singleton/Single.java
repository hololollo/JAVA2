package creational.singleton;
// 객체를 하나만 생성.
public class Single {
	private static Single instance;
	private Single() {}
	public static Single getInstance() {
		if(instance == null) {
			instance = new Single();
		}
		return instance;
	}
}
