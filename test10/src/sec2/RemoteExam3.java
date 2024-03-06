package sec2;

public class RemoteExam3 {

	public static void main(String[] args) {
		
		Tv t = new Tv();
		
		RemoteControl.changeBattery();
		t.turnOn();
		t.setVolume(10);
		t.setMute(true);
		t.setMute(false);
		t.light();
		t.dark();
		t.zoomin();
		t.zoomout();
		t.turnOff();
	}

}
