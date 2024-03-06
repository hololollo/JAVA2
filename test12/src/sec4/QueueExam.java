package sec4;

import java.util.LinkedList;
import java.util.Queue;

// Queue : FIFO - 선입선출 방식(먼저 입력한 데이터가 먼저 출력된다)
// java에서는 Queue가 인터페이스 이므로 같은 구조를 가진 LinkedList를 이용하여 생성한다.★
public class QueueExam {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		
		//큐(Queue)에 요소 추가(.offer();)
		q.offer("아이브");
		q.offer("뉴진스");
		q.offer("케플러");
		q.offer("에스파");
		q.offer("여자아이들");
		q.offer("르세라핌");
		System.out.println(q.peek()); // 선입선출 : 가장 먼저 입력한 데이터 조회
		System.out.println(q.peek());
		
		//큐(Queue)에서 요소 반환(.poll();)
		System.out.println(q.poll()); // 선입선출 : 가장 먼저 입력한 데이터 출력 후 메모리 삭제
		System.out.println(q.poll());
		System.out.println(q);
	}

}
