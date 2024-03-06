package sec1;
// 구현 클래스
public class Staff extends User{
	private int level; // 접근 레벨
	private String part; // 근무 부서
	private String name; // 이름
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Staff [level=" + level + ", part=" + part + ", name=" + name + "]";
	}
	@Override
	public void connect() { // 추상 클래스에서 선언했었던 추상 메서드 내용 기술
		System.out.print(part + "의" + name + "가(이) 출근하였습니다.");	
	}
}