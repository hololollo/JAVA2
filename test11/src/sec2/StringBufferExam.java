package sec2;
// String 내용추가 
public class StringBufferExam {

	public static void main(String[] args) {
		String str = new String("Java Programer");
		str += "Jinior Level";
		str += "Develope";
		System.out.println(str);
		// ★중요도★ StringBuffer < String 구조
		StringBuffer sb = new StringBuffer(); // 스택(stack)구조
		byte[] b = str.getBytes();
		for(byte c : b) { // 문자배열을 문자열로 변경
			char k = (char) c;
			sb.append(k); // 한 문자씩 stringBuffer 추가
		}
		System.out.println(sb);
		
		CharStack cs = new CharStack();
		cs.push('v');
		cs.push('i');
		cs.push('c');
		cs.push('t');
		cs.push('o');
		cs.push('r');
		cs.push('y');
		
		System.out.println(cs.list() + ", 글자 수 : " + cs.list().length); // 문자배열 + String => 문자배열이 주소값 출력
		System.out.println(cs.toString()+ ", 글자 수 " + cs.toString().length()); // 문자열
		System.out.println((char) cs.pop()); //꺼내오는것은 위에서부터(거꾸로)
		System.out.println((char) cs.pop());
		System.out.println((char) cs.pop());
		System.out.println("글자 수 : " + cs.toString().length()); // 위에 3개를 빼서 
		
	}	

}
