package sec3;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

// 스트림(Stream) : 입출력 방식 제어 : 연속된 복합체(컬렉션 프레임워크 형태)로 이루어진 데이터
// ★Stream방식이란? 연속된 복합체인 컬렉션 프레임워크를 훨씬 간결하고, 효과적으로 처리하기 위한 "람다식 방식"의 처리
// 배열형은 별도의 Stream을 생성하지 않고, Array 클래스를 활용합니다.
// Arrays.stream(연속된 복합체 이름).메서드(); 
public class StreamExam {
	public static void main(String[] args) {
		int [] arr = {95,80,100,85,90}; // 배열 선언
		// Stream을 이용한 순회 출력 => Stream은 반복문 forEach로 활용합니다.
		Arrays.stream(arr).forEach(n -> System.out.println(n));
		
		int sum = Arrays.stream(arr).sum(); // 배열을 활용하는것도 가능하다.
		System.out.println("arr의 합계 : " + sum);
		
		OptionalDouble avg = Arrays.stream(arr).average(); // 실수가 나올수도 있고 아닐수도 있는 값을 구할 때 사용하는 util
		System.out.println("arr의 평균 : " + avg);
		
		OptionalInt max = Arrays.stream(arr).max(); 
		System.out.println("arr의 최대값 : " + max);
		
		OptionalInt min = Arrays.stream(arr).min(); 
		System.out.println("arr의 최소값 : " + min);
		
		int cnt = (int) Arrays.stream(arr).count(); // count형의 반환타입이 long형으로 출력되기에 (int) 로 명시적 형변환
		System.out.println("arr의 개수 : " + cnt);
		
	}

}
