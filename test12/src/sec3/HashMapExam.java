package sec3;

import java.util.HashMap;
import java.util.Map;

//자료 구조(자료의 논리적인 저장 원리에 따른 구조)
// 1. 단순구조(Primitive) : int, double, float, char, String, boolean -> 단순형
// 2. 선형구조(Sequence) : 배열(Array), 리스트(List), 스택(Stack), 큐(Queue), 덱(Deque) -> 참조형
// 3. 비 선형구조(Non-Sequence) : 맵(Map), 트리(Tree), 그래프(Graph), 셋(Set) -> 참조형
public class HashMapExam {
	public static void main(String[] args) {
		//선언 방법 : Generic
		Map<String, String> map0 = new HashMap<String, String>(); // Map 인터페이스를 활용한 HashMap선언(맵 끼리 형변환 가능토록)
		HashMap<String, String> map1 = new HashMap<String, String>(); // HashMap 선언 및 생성 표준식
		HashMap<String, String> map2 = new HashMap<>(); // 생성자에 앞서 선언한 인자의 생략이 가능
		HashMap<String, String> map3 = new HashMap<>(map1); // 맵의 복제
		// 배열 개수 지정 : String[] arr = new String[10]; // 맵의 초기 용량은 기본적으로 16개.
		HashMap<String, String> map4 = new HashMap<>(10); // 초기 용량(Capacity) 지정. 만약 11번째것을 추가하게되면 자동적으로 초기용량의 배(20개) 가 지정됨.
		HashMap<String, String> map5 = new HashMap<>(10, 0.7f); // 초기 용량 10개중 70%까지 채우겠다.(load factor : 사용 확률 지정)
		HashMap<String, String> map6 = new HashMap<>() {{ // 기본key와 그에 해당하는 값을 적용하여 HashMap사용
			put("name", "강범준");
		}}; 
		
		// key에 Integer를 넣어서 선언.
		HashMap<Integer, String> fruits = new HashMap<>();
		fruits.put(1, "사과"); // 요소 (Entry) 추가(key, value)
		fruits.put(2, "딸기");
		fruits.put(3, "샤인머스켓");
		fruits.put(4, "망고");
		fruits.put(5, "납작복숭아");
		fruits.put(6, "키위");
		fruits.put(7, "바나나");
		System.out.println("변경 전");
		System.out.println(fruits);
		fruits.remove(3); // 요소 (Entry) 제거(키 값)
		System.out.println("변경 후");
		System.out.println(fruits);
		
		// fruits.clear(); // HashMap의 비우기(전체)
		
		// 순회
		for(Integer i : fruits.keySet()) { // keySet : key집합
			System.out.println(i + ":" + fruits.get(i)); // i = key
		}
		
		// 존재유무 확인
		if(fruits.containsValue("샤인머스켓")) {
			System.out.println("해당 HashMap에 샤인머스켓이 존재합니다.");
		}else {
			System.out.println("존재하지 않아 추가하였습니다.");
			fruits.put(8, "샤인머스켓");
			System.out.println(fruits);
		}
		
	}

}
