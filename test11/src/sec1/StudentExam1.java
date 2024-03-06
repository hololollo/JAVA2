package sec1;

public class StudentExam1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student su1 = new Student();
		Student su2 = new Student();
		// Student su3 = new Student();
		su2 = su1; //얕은 복제
		//복제시에는 반드시 clone()을 오버라이딩해야함.
		Student su3 = (Student) su1.clone();
		System.out.println(su1.getClass().toString()); // 해당 인스턴스의 클래스 이름 출력
		System.out.println(su1.toString()); // 주소만 출력 (su1 인스턴스에 대한 stack에 있는 heap의 위치를 16진수로 출력)
		System.out.println(su1 instanceof Student); // su1 인스턴스가 student클래스로 생성된 것인지 유무를 확인
		System.out.println(su1.equals(su2)); // 두 객체(인스턴스)의 동일여부 확인
		
		//해시코드
		System.out.println(su1.hashCode()); // 주소를 계산값(해싱 : 16진수를 10진수로 변경)으로 출력
		
		//비교 : Student 클래스에서 오버라이딩 하지 않으면 주소 비교
		System.out.println(su3.equals(su1)); // 값을 복제했어도 su3과 su1의 주소가 서로 다르니까 false
		//Student 클래스에 equals를 모든 멤버 필드(변수)에 대하여 비교하는 오버라이딩을 해주면 값 비교가 가능.
		
		
	}

}
