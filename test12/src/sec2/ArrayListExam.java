package sec2;
// ★★★★★★★
import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<Member> memList = new ArrayList<>();
		List<Member> memList2 = new ArrayList<>();
		
		for(int i = 1; i < 10; i++) {
			Member mem = new Member("강범준" + i, 921021 + i, "kang" + i, "pppp" + i, "kangmh1021@gmail.com" + i);
			memList.add(mem);	
		}
		Member mem2 = new Member("강10", 921021, "gang", "tttt", "kangmh1021@naver.com");
		memList.add(mem2);
		
		// List 순회 방법 1
		for(Member m : memList) { 
			System.out.println(m.toString());
		}
		// List 순회 방법 2
		/*
		for(int i = 0; i < memList.size(); i++) {
			Member m = memList.get(i);
			System.out.println(m.toString());
		}
		*/
		// 인덱스가 3인 Member인스턴스가 제거
		memList.remove(3); 
		
		// 존재유무 확인 
		Member tmp1 = new Member("강10", 921021, "gang", "tttt", "kangmh1021@naver.com");
		System.out.println(tmp1.getId() + "의 존재유무 : " + memList.contains(tmp1));
		
		
		for(int i = 0; i < memList.size(); i++) {
			Member m = memList.get(i);
			System.out.println(m.toString());
		}
		
		// 생성만 해줬고 값을 넣지 않았음. (존재유무 확인)
		if(memList2.isEmpty()) {
			System.out.println("비어있는 리스트입니다.");
		}else {
			System.out.println("내용이 있는 리스트입니다.");
		}
		
		List<String> names = new ArrayList<>();
		names.add("이민규");
		names.add("이성하");
		names.add("이연정");
		names.add("이예린");
		names.add("이원석");
		names.add("이종우");
		names.add("이희훈");
		names.set(2, "박범수"); // 인스턴스를 인덱스가 2인 곳에 삽입
		if(names.contains("강민우")) {
			System.out.println("강민우 데이터가 존재합니다.");
		}else {
			System.out.println("강민우 데이터가 존재하지 않습니다.");
			names.add("강민우");
		}
		names.clear();
		if(names.isEmpty()) { // null 체크
			System.out.println("리스트가 비어 있습니다.");
		}else {
		for(String s : names) {
			System.out.println(s);
		}
		
	}
		// 자주 사용하는 메서드 add, remove, contains, isEmpty, get, size : ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
}
}