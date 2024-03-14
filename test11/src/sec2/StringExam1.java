package sec2;
 // ※ 최고중요
public class StringExam1 {

	public static void main(String[] args) {
		String name1 = "강범준";
		String name2 = new String("강범준"); // 같은 의미.
		// int su1 = 1004; -> int형과  String형 비교라서 오류 
		Integer su1 = 1004; // int형을 참조형으로 선언
		String su2 = "1004";
		String su3 = String.valueOf(su1); // su1을 문자열로 변경 ※
		System.out.println(su1.equals(su2)); // 두개 다 참조형으로 취급하니까 가능.(주소값 비교 false)
		System.out.println(su2.equals(su3)); // su3을 int타입으로 변경하니까 가능.(값 비교 true)
		
		
		String str = "강범준/박동빈/이성하/조대신/배곤희/권민지"; 
		// ,,로 나눠 지지 않은 상태로 문자열 하나에서 나누어, 합쳐서 출력하는 방법 (.split, .join)
		
		String[] names = new String[6];
		names = str.split("/"); // "/"기준으로 나누기	※
		for (String s : names) {
			System.out.println(s);
		}
		/*
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		*/
		String str2 = String.join("/", names); // "/"기준으로 합치기  ※
		System.out.println(str2);
		
		
		// String
		String data = " ivE\'s beaUty grOup\nnewjeans is girlGroup Top	";
		
		
		char ten = data.charAt(9); // 10번째 문자(인덱스가 9인 문자) : a
		System.out.println("10번째 문자(인덱스가 9번째) : " + ten);
		String trimData = data.trim(); // 앞 뒤의 공백을 제거하여 trimData에 저장
		System.out.println("앞 뒤의 공백을 제거 : " + trimData.length() + "글자, " + trimData);
		int size = data.trim().length(); // 글자수를 size에 저장
		System.out.println("앞 뒤 공백을 제거한 글자수 : " + size);
		int n = data.indexOf('n');	// n의 글자 위치(인덱스)를 n에 저장
		System.out.println("n의 글자 위치(인덱스)를 n에 저장 : " + n);
		int n2 = data.lastIndexOf('n');	// 마지막 n의 글자 위치(인덱스)를 n2에 저장
		System.out.println("마지막 n의 글자 위치(인덱스)를 n에 저장 : " + n2);
		String up = data.toUpperCase();	// 모두 대문자로 변환하여 up에 저장
		System.out.println("모두 대문자로 변환하여 up에 저장 : " + up);
		String down = data.toLowerCase();	// 모두 소문자로 변환하여 down에 저장
		System.out.println("모두 소문자로 변환하여 up에 저장 : " + down);

		String sub1 = data.substring(22, 30);	// 공백을 제거하고,22번째 글자 '부터' 29번째만 추출하여 sub1에 저장 ※ 
		System.out.println("공백을 제거하고,22번째 글자 '부터' 29번째만 추출하여 sub1에 저장 : " + sub1);

		String sub2 = data.replace("newJeans", "kepler");	// newJeans의 단어를 Kepler로 변경하여 sub2에 저장
		System.out.println("newJeans의 단어를 Kepler로 변경하여 sub2에 저장 : " + sub2);
		byte[] girl = data.trim().getBytes();	// 문자열을 girl 문자(byte)배열로 변환하여 저장 ※
		System.out.println("글자 수 : " + girl.length); // -> 메서드가 아닌 속성으로
		for(byte b : girl) {
			char k = (char) b;
			System.out.println(k);
		}
		String girlgroup = data.substring(data.lastIndexOf	('g'), data.lastIndexOf('g') + 9);	// girl의 g의 마지막 위치부터 9문자를 추출하여 저장. 
		girlgroup = girlgroup  + " " + sub1;
		System.out.println("girlgroup : " + girlgroup);
		
		
		//문자(byte)배열을 문자열(String)으로 변환 출력
		String str4 = new String(girl);
		System.out.println(str4);
	}
	
	

}
