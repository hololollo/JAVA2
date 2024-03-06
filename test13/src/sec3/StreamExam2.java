package sec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
// String타입의 List Stream 방식 활용
// ex) stream.메서드();
public class StreamExam2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("이연정");
		lst.add("조우진");
		lst.add("박은성");
		lst.add("강민우");
		lst.add("장인범");
		lst.add("박범수");
		
		//ArrayList의 Stream화
		Stream<String> stream = lst.stream(); 
		System.out.println("정렬 전");
		stream.forEach(s -> System.out.println(s));
		
		/*
		for(String s : lst) {
			System.out.println(s);
		}
		*/
		System.out.println("=======");
		System.out.println("정렬 후");
		lst.stream().sorted().forEach(s -> System.out.println(s)); // sort : 정렬
		
		//요소 수 계산하여 출력
		int cnt = (int) lst.stream().count(); // 명시적 형변환(count형의 반환값이 long형이기 때문에)
		System.out.println("인원 수 : " + cnt);
	}

}
