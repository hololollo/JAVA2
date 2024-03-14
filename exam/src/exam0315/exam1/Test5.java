package exam0315.exam1;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과", "빨강"));
		list.add(new Fruit("메론", "초록"));
		list.add(new Fruit("포도", "보라"));
		// list.add("바나나");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
		//List 인터페이스에는 length 속성이 없습니다. 대신 size() 메서드를 사용하여 리스트의 크기를 얻을 수 있습니다.
		//리스트 요소에 접근할 때는 인덱스 연산자([])를 사용할 수 없습니다. 리스트의 각 요소에 접근하려면 get() 메서드를 사용해야 합니다.
	}

}
