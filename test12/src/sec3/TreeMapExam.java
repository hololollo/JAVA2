package sec3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		//TreeMap 선언 및 객체 생성
		Map map0 = new TreeMap<>();
		TreeMap<Integer, String> map1 = new TreeMap<Integer, String>();
		TreeMap<Integer, String> map2 = new TreeMap<>();
		TreeMap<Integer, String> map3 = new TreeMap<>(map1);
		TreeMap<Integer, String> map4 = new TreeMap<>() {{
			put(1, "강범준");
		}};
		
		map2.put(1, "강범준"); // 요소(Entry)를 추가(값 추가X)
		map2.put(2, "ㄱ");
		map2.put(3, "ㅏ");
		map2.put(4, "ㅇ");
		
		// 키가 4인 요소를 제거
		map2.remove(4);
		System.out.println(map2);
		// TreeMap 비우기
		// map2.clear();
		// System.out.println(map2);
		
		//TreeMap 순회하여 출력
		for(Integer i : map2.keySet()) { // key : i , keySet : key집합
			System.out.println(i + ":" + map2.get(i)); // i = key
		}
		System.out.println("map2 : " + map2);
		System.out.println("map2에서 키가 5인 요소 : " + map2.get(5));
		System.out.println("map2에서 가장 첫 엔트리 : " + map2.firstEntry());
		System.out.println("map2에서 가장 첫 키 : " + map2.firstKey());
		System.out.println("map2에서 가장 마지막 엔트리 : " + map2.lastEntry());
		System.out.println("map2에서 마지막 키 : " + map2.lastKey());
		
		
	}
}
