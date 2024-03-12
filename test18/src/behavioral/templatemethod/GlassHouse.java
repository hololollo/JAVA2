package behavioral.templatemethod;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("유리벽을 만듭니다.");
	}

	@Override
	public void buildPillars() {
		System.out.println("유리 기중을 만듭니다.");
	}

}
