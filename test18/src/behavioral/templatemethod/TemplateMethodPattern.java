package behavioral.templatemethod;
// TemplateMethodPattern : 공통 메서드를 상위 클래스에서 정의, 세부 사항은 하위클래스에서 구현
public class TemplateMethodPattern {
	public static void main(String[] args) {
		HouseTemplate house1 = new WoodenHouse();
		house1.buildHouse(); // final이면 상속 불가능
		System.out.println();
		
		house1 = new GlassHouse();
		house1.buildHouse();
		System.out.println();
	}
}
