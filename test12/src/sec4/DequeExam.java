package sec4;

import java.util.Deque;
import java.util.LinkedList;

// 덱 : Stack + Queue => 양족에서 입력과 출력이 모두 가능한 구조. 다만, LinkedList로 생성
// LIFO 와 FIFO가 모두 가능한 구조(front-rear)
public class DequeExam {
	public static void main(String[] args) {
		Deque<String> d = new LinkedList<>();
		
		
		// 추가(앞,뒤 둘 다 가능)
		d.addFirst("자바"); // 자바
		d.addFirst("파이썬"); // 파이썬 - 자바
		d.addLast("자바스크립트"); // 파이썬-자바-자바스크립트
		d.addFirst("리액트"); // 리액트 - 파이썬 - 자바 -자바스크립트
		d.addLast("노드"); // 리액트 - 파이썬 - 자바 -자바스크립트-노드
		d.addLast("스타일시트"); // 리액트 - 파이썬 - 자바 -자바스크립트-노드-스타일시트
		System.out.println(d);
		System.out.println(d.peek()); // Queue처럼 동작(맨 앞에것을 조회)
		System.out.println(d.peekLast()); // Stack처럼 동작(맨 뒤에것을 조회)
		System.out.println(d.peekFirst()); // Queue처럼 동작(first생략 가능)
		System.out.println("--");
		System.out.println(d.poll()); // Queue처럼 동작(반환)
		System.out.println(d.pollLast()); // Stack처럼 동작(반환)
		System.out.println(d.pollFirst()); // Queue처럼 동작(반환)
		System.out.println(d);
		System.out.println("--");
		System.out.println(d.pop()); // Stack처럼 맨 처음 요소 동작(반환) : 마지막에 출력한 것에서 제어점의 위치에 따라 달라진다. 
		System.out.println(d);
	}

}
