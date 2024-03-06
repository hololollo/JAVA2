package sec1;

class Point<T, V> { // 좌표점 제네릭
	T x; // x축에서의 (가로)위치
	V y; // y축에서의 (세로)위치
	// public Point() {}
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}
	//디폴트 값이니까 getter만.
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
	
}



public class GenericExam4 {
	//제네릭 메서드 : 해당 클래스에 메서드로 반환타입에 관계없이 활용할 수 있는 메서드
	// public [Static : 메인메서드가 있으면 생략 가능]<인자1, ...> 반환타입 메서드명(매개변수 타입 매개변수.....) {}
	public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
		double left = ((Number) p1.getX()).doubleValue(); // 왼쪽의 위에점이 p1
		double right = ((Number) p2.getX()).doubleValue(); // 오른쪽의 아래점이 p2
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left; 
		double height = bottom - top;
		
		return width * height;
		
	}
	public static void main(String[] args) {
		Point<Integer, Double> p1 = new Point<>(0, 0.0); // 왼쪽 상단점
		
		Point<Integer, Double> p2 = new Point<>(20, 20.0); // 오른쪽 하단점
		
		Double square = GenericExam4.<Integer, Double> makeRectangle(p1, p2); 
		// GenericExam4.<Integer, Double> 생략 가능(자바1.7이상)
		
		System.out.println("사각형의 면적 : " + square);
		
		
	}

}
