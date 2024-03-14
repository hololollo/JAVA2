package exam0315.exam1;

public class Test4 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		// Person 클래스를 생성하여 name을 선언해주고, 생성자를 생성, getter/setter를 이용해서 이름을 가져와야 한다.
		
		// Person 객체를 생성해서 배열에 할당해줘야 한다.
		pArr[0] = new Person("강범준");
		pArr[1] = new Person("이종우");
        pArr[2] = new Person("유정환");
		
		for(int i = 0; i < pArr.length; i++) {
            if(pArr[i] != null) {
			System.out.println(pArr[i].getName());
		} else {
			System.out.println("오류");
		}
	}
	// 배열 pArr은 길이가 3인 Person 객체 배열이고
	// i의 범위는 0부터 3까지인데, 범위를 초과하여 오류가 발생할 수 있다. 
	}
}
