package sec2;

public class Birds extends Animal{ // 확장, animal(상속 받는다)
	int wings;
	boolean fly;

	public int getWings() {
		return wings;
	}

	public void setWings(int wings) {
		this.wings = wings;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	@Override
	public String print() { // default값으로 직접 접근 가능
		return "Birds wings = [" + wings + "], name = [" + super.name + "]";
	}
	
	
}
