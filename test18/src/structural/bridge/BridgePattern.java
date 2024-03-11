package structural.bridge;
// Bridge Pattern : 추상화를 구현으로부터 분리하여 각각 독립적으로 변화할 수 있도록 하는 패턴.
// 그러므로, 기능과 구현을 분리하여 독립적으로 변형과 확장이 가능하도록 결합도를 낮춘 패턴★  
// 결합도가 높다 : 변형과 확장성 떨어짐.(개별적으로 사용해서 서로서로 사용하는 것이 좋음(결합도 낮춤))
// Bridge(Color)를 특정 추상화 클래스(Shape)에 멤버로 기용하고, 서브 클래스(Triangle, Pentagon)에서
// 해당 색상을 골라 서로 다른 클래스를 조합하여 원래보다 더 큰 객체를 구현 할 수 있도록 하는 패턴
public class BridgePattern {
	public static void main(String[] args) {
		Shape triangle1 = new Triangle(new RedColor()); // color가 인터페이스이기 때문에
		Shape triangle2 = new Triangle(new GreenColor()); 
		Shape pentagon1 = new Pentagon(new GreenColor());
		Shape pentagon2 = new Pentagon(new RedColor());
		
		triangle1.applyColor();
		triangle2.applyColor();
		pentagon1.applyColor();
		pentagon2.applyColor();
		
	}

}
