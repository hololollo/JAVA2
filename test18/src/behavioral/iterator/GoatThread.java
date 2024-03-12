package behavioral.iterator;

import java.util.HashMap;
import java.util.Iterator;

// Goat를 Map으로 선언하고, 키와 값들로 분리

public class GoatThread {
	
	public static final int MAX_GOATS = 100; // 상수 값
	private int goatNum = 0; // 염소 순번(키)
	public static final HashMap<Integer, Goat> GOATS = new HashMap<>(); // 상수 값
	public GoatThread() {
		super();
		int i;
		for(i = 0; i < 30; i++) { // 염소 0~29까지 30마리의 임의 GOATS Map을 생성
			GOATS.put(i, new Goat()); // 키, 값
		}
		goatNum = i;
	}
	public void addGoat() { // 염소 추가
		if(GOATS.size() <= MAX_GOATS) {
			GOATS.put(++goatNum, new Goat());
		}
	}
	public void removeGoat() {
		if(GOATS.size() > 0) {
			GOATS.remove(--goatNum);
		}
	}
	public Iterator<Integer> createIterator() {
		return GOATS.keySet().iterator(); // 키만 따로 (keyset)
	}
	
	public Iterator<Goat> goatIterator() {
		return GOATS.values().iterator(); // 밸류만 따로(values)
	}
}
