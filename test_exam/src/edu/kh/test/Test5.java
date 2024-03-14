package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

import com.kh.test5.model.Fruit;

public class Test5 {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		// list.add("바나나"); 
		// 만약, fruit 생성자로 name필드를 넣어주고, color필드값도 추가해서 넣어줬다면 가능하다.  
		// 현재 상황에서 list(ArrayList)의 제네릭 타입은 Fruit으로 설정되어 있으므로 Fruit으로 객체를 생성하여 요소를 추가해야 하지만, 코드에서는 생성자 없이 String 요소를 추가하였으므로  
		// => Type Error(MisMatch)발생
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		// (원인)List 컬렉션 프레임 워크는 인터페이스이며, length 속성이 없다. => Attribute(속성) Not Found Error 발생 
		// (결과)대신 size() 메서드를 사용하여 리스트의 크기(요소의 개수)를 얻을 수 있다.
		// (원인)인덱스 연산자([])는 배열객체에서 활용하는 연산자이므로 리스트 요소에 접근할 때는 인덱스 연산자를 사용할 수 없다.
		// (결과)리스트의 각 요소에 접근하려면 get() 메서드를 사용해야 한다.
	}

}