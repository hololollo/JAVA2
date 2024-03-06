package sec4;

import java.util.Stack;

// 스택(Stack) : 탑 같이 입력할 때는 쌓아 올려지고, 출력할 때는 반대로 맨 마지막에 입력된 데이터부터 출력
// LIFO(LAST IN FIRST OUT)구조(후입선출)
// push, pop : 빼오기(스택 메모리 데이터 삭제), peek : 있는지 확인만 하기(조회, 메모리 유지)
public class StackExam {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		
		// 요소 추가
		stack.push("사과");
		stack.push("파인애플");
		stack.push("샤인머스킷");
		stack.push("수박");
		stack.push("멜론");
		stack.push("체리");
		stack.push("암라");
		stack.push("불수감");
		
		System.out.println(stack);
		
		System.out.println(stack.peek());// 마지막 요소 조회만
		System.out.println(stack.peek());
		System.out.println(stack.pop()); // 반환 후(마지막 데이터를 출력하고) 데이터 메모리를 삭제
		System.out.println(stack.pop());
		System.out.println(stack);
	}
	

}
