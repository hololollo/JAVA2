package sec3;
// Map : HashMap, Hashtable, TreeMap, Properties => 키와 값 분리시에는 entry 또는 element 단위로 Iterator나 Enumeration이 필요
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

// Map : key, value로 이루어져 있다.
public class MapExam {

	public static void main(String[] args) {
		//Map은 List처럼 index가 없어서 순서가 없다.
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, String> map2 = new Hashtable<>();
		Map<Integer, String> map3 = new TreeMap<>();
		Properties map4 = new Properties();
		
		
		//HashMap
		map1.put("kim", 90); // put(key, value) : 추가
		map1.put("lee", 100); 
		map1.put("park", 80); 
		map1.put("kang", 100); 
		map1.put("kwon", 90); 
		System.out.println(map1); // toString
		
		
		//개별요소 접근
		System.out.println("---------------------방법1");
		//방법 1(key)
		System.out.println("park : " + map1.get("park")); // get(index)가 아닌 get(key)
		//개별요소 접근시 인덱스가 아니라 key값으로 접근
		
		System.out.println("\t맵 순회1\t");
		// 맵 순회1 : Iterator(분리자, 독립자)에 의한 접근
		Iterator<String> key = map1.keySet().iterator(); // map1의 key모음(keyset())을 나눠준다.(iterator)
		// key = {kim,lee,park,kang,kwon}
		while(key.hasNext()) { // 다음값이 있으면
			String k = key.next();
			System.out.println(k + "=" + map1.get(k)); // map1.get("kim") ~ map1.get("kwon")
		}
		
		System.out.println("\t맵 순회2\t");
		//맵 순회2 : entrySet(키와 같의 쌍)에 의한 접근
		for(Map.Entry<String, Integer> en : map1.entrySet()) {
			String k = en.getKey();
			Integer value = en.getValue();
			System.out.println(k + " : " + value);
		}
		
		System.out.println("\t맵 순회3\t");
		//맵순회 3 : KeySet에 의한 접근
		for(String k : map1.keySet()) {
			System.out.println(k + " : " + map1.get(k));
		}
		
		System.out.println("---------------------방법2");
		//방법 2(key)
		if(map1.containsKey("kang")) { // 특정 key의 존재유무 확인
			System.out.println("kang : " + map1.get("kang"))  ;
		}else {
			System.out.println("키가 kang인 요소는 존재하지 않습니다.");
		}
		
		System.out.println("---------------------방법3");
		//방법 3(value)
		if(map1.containsValue(100)) { // 특정 value의 존재유무 확인
			System.out.println("만점자가 존재합니다.");
		}else {
			System.out.println("만점자가 없습니다.");
		}
		
		
		//Hashtable
		map2.put("김", "1코스"); // put : 값 저장
		map2.put("이", "2코스"); 
		map2.put("박", "3코스"); 
		map2.put("김", "2코스"); // ★key : 중복 불가능★
		map2.put("이", "3코스"); // ★key : 중복 불가능★
		map2.put("최", "1코스"); 
		System.out.println(map2); // value : 중복 가능, key값이 중복이라면 마지막에 입력된 값이 해당 값이 된다(java특징)
		map2.remove("김");
		System.out.println("\t편집 후 \t");
		System.out.println(map2);
		map2.clear();
		System.out.println("\t비우기 후 \t");
		System.out.println(map2);
		
		System.out.println("\t TreeMap \t");
		//배열의 값을 TreeMap에 대입
		String[] names = {"가","나","다","라","마","바","사","아","자","차"};
		for(int i = 0; i <= 9; i++) {
			map3.put(i, names[i]);	
		}
		System.out.println("인원수 : " + map3.size());
		for(Integer i : map3.keySet()) {
			int k = i;
			String value = map3.get(k);
			System.out.println(k + " : " + value);
		}
		System.out.println();
		
		System.out.println("\t Properties : 속성 \t");
		// Properties : 키(필드이름), 값은 문자열로 취급된다.
		map4.setProperty("name", "강범준");
		map4.setProperty("age", "32"); // 숫자도 문자열로 적어야 한다.
		map4.setProperty("height", "177.1");
		map4.setProperty("kor", "100");
		map4.setProperty("eng", "99");
		map4.setProperty("mat", "98");
		System.out.println("이름 : " + map4.getProperty("name"));
	}

}
