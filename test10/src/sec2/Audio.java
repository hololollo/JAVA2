package sec2;

public class Audio implements RemoteControl{
	
	int volume;

	public void turnOff() {
		System.out.println("전원 OFF");
	}

	public void turnOn() {
		System.out.println("전원 ON");
	}

	public void setVolume(int volume) {
		if (volume > MAX) {
			this.volume = RemoteControl.MAX;
		} else if (volume < MIN) {
			this.volume = RemoteControl.MIN;
		} else {
			this.volume = volume;
		}
	}
}
