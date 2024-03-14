package edu.kh.test;

import com.kh.test4.model.Person;

public class Test4 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3]; // 배열이 선언만 되어있다.
		
		// Person 클래스를 생성하여 name을 선언해주고, 생성자를 생성, getter/setter를 이용해서 이름을 가져와야 한다.
		
		// 비어있는 pArr배열에 Person 객체를 생성해서 각 요소(0~2)에 생성된 객체를 할당해줘야 한다.
		pArr[0] = new Person("강범준");
		pArr[1] = new Person("이종우");
        pArr[2] = new Person("유정환");
		//for(int i = 0; i<=pArr.length; i++) {
		for(int i = 0; i < pArr.length; i++) {
            if(pArr[i] != null) { 
            	System.out.println(pArr[i].getName()); 
            } 
		}
	}
	// 16행(원인) : 배열 pArr은 길이가 3인 Person 객체 배열이고
	// 16행(원인) : i의 범위는 0부터 3까지인데, 범위를 초과하여 오류가 발생할 수 있다. => ArrayIndexOutOfBoundsException 발생
	// 18행(결과) : Person 의 배열요소인 pArr 객체가 초기화(값이 대입)되어 있지 않아 결과적으로 NullPointerException 발생
}