package sec1;

public class GenericExam {

	public static void main(String[] args) {
		//생성자에 대한 제네릭의 타입 생략 가능(자바1.7이상)
		Generic1<Student> s = new Generic1<>();
		Student a = new Student("장원영", 21);
		s.setField1(a);
		Generic1<Teacher> t = new Generic1<Teacher>();
		Teacher b = new Teacher("강범준", 32);
		t.setField1(b);
		// generic1<int> i = new generic<>(); 기본형 불가능.
		Generic1<Integer> i = new Generic1<>();
		i.setField1(1004);
		Generic1<String> str = new Generic1<>();
		str.setField1("강범준");
		
		
	}

}
