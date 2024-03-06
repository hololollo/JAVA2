package sec2;

import java.util.ArrayList;
import java.util.List;

// 컬렉션 프레임 워크(Collection Framwork) : 자바에서 기본적으로 제공하는 여러 데이터를 저장하고, 관리하기 위하여 미리 준비해놓은 도구
// Map, Set, ★List => 기본은 모두 제네릭 형태이다.
public class CollectionExam1 {

	public static void main(String[] args) {
		// List 인터페이스 : ArrayList, Vector, LinkedList 클래스
		// Set 인터페이스 : HashSet, TreeSet 클래스
		// Map 인터페이스 : HashMap, HashTable, TreeMap, Properties 클래스
		// Stack, Queue, Deque 등 도 자료구조에 해당하는 컬렉션 프레임워크의 일종이다.
		
		// 자료구조인 컬렉션 프레임워크에서 자주 사용하는 메서드
		// add : 해당 컬렉션 프레임워크의 인스턴스 추가
		// clear : 해당 컬렉션 프레임워크의 모든 인스턴스 제거
		// remove : 해당 컬렉션 프레임워크의 특정 인스턴스 제거
		// size : 해당 컬렉션 프레임워크의 인스턴스 개수
		
		// iterator : 분리자(반복자)를 의미 - HashSet, TreeSet
		
		List<String> lst = new ArrayList<String>();
		lst.add("강범준"); // 하나하나가 string타입
		lst.add("김동연");
		lst.add("장인범");
		lst.add("이필규");
		for(String s: lst) {
			System.out.println(s);
		}
		// List<Student>, Map<Board>, Set<Data> => <>로 인자가 규정되므로 기본형 타입을 제외하고 어떤 참조형 타입이 와도 상관없음(Generic). 
	}

}
