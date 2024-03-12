package behavioral.templatemethod;
//House(집)을 짓는 공통 메서드를 정의하되, 재료가 정해지지 않은 것들은 추상 메서드로 정의
public abstract class HouseTemplate {
	public void buildHouse() {
	// private final void buildHouse() { // final : 상속 불가능
		buildPillars();
		buildWalls();
		buildWindows();
		buildFoundation();
	}
	
	private void buildWindows() {
		System.out.println("유리창문 만들기");
	}
	
	public abstract void buildWalls(); // 아직 재료를 뭘로 할지 정하지 않았음.(추상)
	public abstract void buildPillars();
	
	private void buildFoundation() {
		System.out.println("벽체/기둥 등의 재료에 맞는 마감재를 선택하였습니다.");
	}
}
