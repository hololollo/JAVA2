package sec1;

// 퍼블릭 클래스 안에 클래스를 또 추가 할 수 있다.
class Animal {
	
	private String type;
	private String name;
	private int leg = 4; // 초기값을 따로 지정해줄 수 있다.
	private int wing = 0;
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public int getWing() {
		return wing;
	}

	public void setWing(int wing) {
		this.wing = wing;
	}
	
	@Override
	public String toString() {
		return "Animal [type=" + type + ", name=" + name + ", leg=" + leg + ", wing=" + wing + "]";
	}
	public void print() {
		System.out.println(this.toString());
	}
}

public class AnimalEx {
	public static void main(String[] args) {
		
		Animal ani1 = new Animal();
		
		ani1.setType("포유류");
		ani1.setName("호랑이");
		ani1.print();
		
		Animal ani2 = new Animal();
		ani2.setType("조류");
		ani2.setName("독수리");
		ani2.setLeg(2);
		ani2.setWing(2);
		ani2.print();
		
		Animal ani3 = new Animal();
		ani2.setType("파충류");
		ani2.setName("아나콘다");
		ani2.setLeg(0);
		ani2.setWing(0);
		ani2.print();
		
	}
}




