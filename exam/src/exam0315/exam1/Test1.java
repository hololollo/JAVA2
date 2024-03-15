package exam0315.exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List : 인터페이스로 객체를 생성할 수 없다.
		//ArrayList : 클래스 / ipInfoList는 ArrayList로 생성해야 하지만, null로 대입되어있기 때문에 요소를 추가하는 14~16행의 문장(add)은 NullPointerException 발생
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
		
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		// ipInfoList.add(new IPInfo("212.133.7.8")); // IPInfo 클래스에서 매개변수 하나만 전달 받는 생성자(Constructor)는 없으므로 객체 생성 불가 
		ipInfoList.add(new IPInfo("177.233.111.222", "고길순"));
		
		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(int i = 0; i < ipInfoList.size(); i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) {
				System.out.println(ipInfoList.get(i).toString()); // toString 생략 가능
				return;
				} 
		} 
		System.out.println("일치X");
	// 일치하는 ip 사용자가 없는 경우 메세지 출력이 없음. (boolean sw개념을 이용하자. 그래서 참일경우 출력될수 있게 하고 거짓일경우엔 정상이 아니라고 해주면 된다.)
		}
	}



