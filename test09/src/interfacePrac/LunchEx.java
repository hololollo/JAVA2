package interfacePrac;

public class LunchEx {
	
	public static void main(String[] args) {
		
		Lunch food;
		System.out.println("한식메뉴");
		food = new Korean();
		food.eating("제육볶음");
		
		System.out.println("중식메뉴");
		food = new Chinese();
		food.eating("짬뽕");
		
		System.out.println("일식메뉴");
		food = new Japanese();
		food.eating("초밥");
	}
	

}
