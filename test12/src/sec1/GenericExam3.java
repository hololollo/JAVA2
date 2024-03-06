package sec1;


interface Matrial {
	void doPrinting();
}

class Powder implements Matrial {

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료로 출력합니다");
	}
	public String toString() {
		return "Powder";
	}
}

class Plastic implements Matrial {

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료로 출력합니다.");
	}
	public String toString() {
		return "Powder";
	}
}

// T extends Matiral => ★제네릭의 한정자★
class GenericPrint<T extends Matrial> { // Matrial 인터페이스의 자식(후손)클래스만 허용
	private T matrial;
	public GenericPrint() {}
	public GenericPrint(T matrial) {
		super();
		this.matrial = matrial;
	}
	public T getMatrial() {
		return matrial;
	}
	public void setMatrial(T matrial) {
		this.matrial = matrial;
	}
	
}



public class GenericExam3 {
	public static void main(String[] args) {
		Plastic p1 = new Plastic();
		p1.doPrinting();
		GenericPrint<Plastic> g1 = new GenericPrint<>(p1); // plastic이 matrial의 자식클래스니까 가능.
		
		Powder p2 = new Powder();
		p2.doPrinting();
		GenericPrint<Powder> g2 = new GenericPrint<>(p2); 
		
		// ★★★★ GenericPrint<Student> g3 = new GenericPrint<>(); // Matrial의 자식클래스에 해당하지 않으므로 불가능.
	}

}
