package sec2;

public class RemoteExam4 {

	public static void main(String[] args) {
		Audio a1 = new Audio();
		
		RemoteControl.changeBattery();
		a1.turnOn();
		a1.setVolume(4); // 최대 : 10
		a1.setMute(true);
		a1.setMute(false);
		a1.turnOff();
	}

}
