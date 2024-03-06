package sec4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

// Set : 중복허용 X, 순서유지X, 값만 저장 <-> Map : 중복허용X, 순서유지X, 키(또는 속성)와 값 저장
// Set 종류 : Hashset, TreeSet ... 
public class SetExam {

	public static void main(String[] args) {
		// Set의 선언 및 생성
		Set<String> set1 = new HashSet<String>();
		Set<Integer> set2 = new TreeSet<>();
		
		set1.add("강범준"); // 요소자국
		set1.add("김기태");
		set1.add("이정희");
		set1.add("이종우");
		set1.add("이연정");
		set1.add("강범준"); // 중복 발생 -> 중복을 허용하지 않음.
		set1.add("이성하");
		set1.add("이민규");
		set1.add("이원석");
		
		System.out.println("요소의 수 : " + set1.size());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		if(set1.contains(name)) {
			System.out.println("해당 이름이 존재합니다.");
		}else {
			set1.add(name);
			System.out.println("name + 입력되었습니다.");
		}
		if(set2.isEmpty() ) {
			System.out.println("set2가 비어있습니다.");
		}else {
			System.out.println("set2 요소의 수 : " + set2.size());
		}
		
		//set1에 특정 요소 삭제
		set1.remove("이원석");
		
		
		//set1 비우기
		set1.clear();
		
		
		Set<Integer> set3 = new TreeSet<Integer>(Arrays.asList(9,3,4,6,8,7,6));
		System.out.println(set3);
		
		System.out.println("\n향상된 for문 순회");
		//Set의 순회 -> 향상된 for문
		for(Integer s : set3) {
			System.out.print(s + "\t");
		}
		System.out.println("\nIterator에 의한 순회");
		//set의 숫회2 -> Iterator에 의한 순회
		Iterator it = set3.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + "\t");
		}
		System.out.println();
		
	}
	

}
