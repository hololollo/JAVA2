package sec1;

public class BirthdayEx1 {

	public static void main(String[] args) {

		Birthday birth1 = new Birthday();
		birth1.setName("강범준");
		birth1.setYear(1992);
		birth1.setMonth(10);
		birth1.setDay(21);
		birth1.birth();
		birth1.birthAddr();
		
		//같은 클래스라 하더라도 주소 객체가 다를 수 있다.
		Birthday birth2 = new Birthday();
		birth2.setName("아무개");
		birth2.setYear(2000);
		birth2.setMonth(10);
		birth2.setDay(21);
		birth2.birth();
		birth2.birthAddr();
	
	}

}
