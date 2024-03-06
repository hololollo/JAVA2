package sec1;
// extends : animal 확장(Animal(부모, super)로 부터 모든 멤버를 상속받은 Mammal(자식, sub) 클래스)
public class Mammal extends Animal{
	private int leg;

	public int getLeg() {
		return leg;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	@Override
	public String print() { // this(자기자신 클래스) <-> super(상위 클래스)
		return "Mammal [ leg=" + leg + "], name = [" + super.getName() + "]";
	}
	
}
