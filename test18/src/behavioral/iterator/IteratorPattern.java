package behavioral.iterator;

import java.util.Iterator;

// IteratorPattern : 컬렉션의 구현은 노출시키지 않고 요소들에 접근 할 수 있는 패턴
public class IteratorPattern {
	public static void main(String[] args) {
		GoatThread goats = new GoatThread(); // 0~29
		goats.addGoat(); // 30
		goats.addGoat(); // 31
		goats.removeGoat(); // 31
		goats.addGoat(); // 32
		goats.addGoat(); // 33
		Iterator<Integer> goatIter = goats.createIterator();
		while(goatIter.hasNext()) { // hasnext : boolean타입으로 반환
			int key = goatIter.next(); // next : 매개변수 혹은 iterator되는 타입으로 반환(여기서는 int)
			Goat goat = goats.GOATS.get(key);
			System.out.println(key);
			goat.sound();
		}
	}
}
