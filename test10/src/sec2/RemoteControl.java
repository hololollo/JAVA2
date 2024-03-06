package sec2;

public interface RemoteControl {
	int MAX = 10; // 정의하면 자동으로 상수 처리
	int MIN = 0;
	
	//추상 메서드(접근제한자 : public)
	void turnOff();
	public void turnOn(); 
	public void setVolume(int volume);
	
	// 디폴트 메서드(default method)
	// ☆인터페이스의 메서드☆는 기본이 추상메서드이므로 선언만 가능하다. => 접근제한자 기본 : public
	// ☆그러나 구현 내용을 기술하고 싶을 경우☆, 기본 접근 제한자 default로 명기하면 된다.
	// 같은 패키지 안에서 default메서드를 호출하여 실행 할 수 있으며, 오버라이딩 가능하다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리");
		} else {
			System.out.println("무음 해제");
		}
	}
	//구현 내용 기술이 필요한 경우 static으로 지시자를 선언하면 된다.
	// 객체 생성없이 public 접근 제한으로 메서드를 호출하여 실행 할 수 있으며, 오버라이딩 하지 않는다.
	
	static void changeBattery() {
		System.out.println("건전지 교체");
	}
}
