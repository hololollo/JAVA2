package structural.bridge;

public abstract class Shape {
	protected Color color; // composition color를 멤버로 기용
	
	public Shape(Color color) {
		this.color = color;
	}
	abstract public void applyColor();
	
}
