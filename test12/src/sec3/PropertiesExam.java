package sec3;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesExam {

	public static void main(String[] args) {
		//Properties 선언 및 생성
		Properties pro = new Properties();
		
		
		pro.setProperty("job", "developer"); // 반드시 두개의 문자열로 구성
		pro.setProperty("name", "강범준"); // "name" element(속성) 
		pro.setProperty("age", "32");  // "age" element
		pro.setProperty("local", "경기도"); // "local" element
		
		System.out.println(pro);
		System.out.println("엘리먼트 수 : " + pro.size());
		
		//개별접근
		System.out.println("개별접근 -> pro의 name 엘리먼트 값 :" + pro.getProperty("name"));
		
		//순회 => 향상된 for문 X, 열거 형으로 해당 엘리먼트의 키(속성)를 가져와 처리해야 함.
		Enumeration e = pro.propertyNames();
		while(e.hasMoreElements()) {
			String el = (String) e.nextElement();
			System.out.println(el + ":" + pro.getProperty(el));
		
		}
	}

}
