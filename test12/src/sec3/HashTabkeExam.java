package sec3;

import java.util.Hashtable;
import java.util.Set;

public class HashTabkeExam {

	public static void main(String[] args) {
		//HashTable
		Hashtable<String, Integer> hash = new Hashtable<>();
		hash.put("서울", 1);
		hash.put("부산", 2);
		hash.put("인천", 3);
		hash.put("대구", 4);
		hash.put("대전", 5);
		hash.put("광주", 6);
		hash.put("울산", 7);
		
		//hash table 요소의 수를 출력
		System.out.println("hash 엔트리 수 : " + hash.size());
		
		// hash table에 키가 "광주"인 요소가 존재하는지 비교
		if(hash.containsKey("광주")) {
			System.out.println("있다.");
		}else {
			System.out.println("없다");
		}
		
		//hash table의 키만 Set으로 저장한 후 출력
		Set<String> KeySet = hash.keySet();
		System.out.println("hash의 키 : " + KeySet); // 출력값에 [] <=> TreeMap, HashMap : {}
		
		//hash table에서 키가 "대구"인 요소 제거
		hash.remove("대구");
		
		
		//hash table의 순회하여 모든 엔트리의 키와 값을 출력
		for(String i : hash.keySet()) {
			System.out.println(i + ":" + hash.get(i)); // i = key
		}
	}

}
