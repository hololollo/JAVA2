package sec1;

public class Laptop implements Computer{

	@Override
	public void display() {
		System.out.println("노트북 모니터 기본 해상도 : 2560x1440");		
	}
	@Override
	public void typing() {
		System.out.println("노트북은 기본 내장된 키보드를 타이핑합니다.");
	}
	@Override
	public void power(boolean sw) {
			if(sw) {
				System.out.println("노트북의 전원을 켭니다.");
			} else {
				System.out.println("전원을 종료합니다.");
			}
		} 
	//오버로딩 된 power 메서드
	public void power(String name, boolean sw) {
		System.out.println();
	}
}
