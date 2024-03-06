package sec2;

public class RemoteExam5 {

	public static void main(String[] args) {
		RemoteControl r; //remoteControl 객체 선언
		
		r = new RemoteControl() {
			int volume;
			public void turnOff() { 
				System.out.println("기기전원OFF");
			}
			public void turnOn() {
				System.out.println("기기전원ON");
			}
			public void setVolume(int volume) {
				if(volume > MAX) {
					this.volume = RemoteControl.MAX;
				} else if (volume < MIN) {
					this.volume = RemoteControl.MIN;
				} else {
					this.volume = volume;
				}
			}
			public void setMute(boolean mute) {
				if(mute) {
					System.out.println("무음처리");
				} else {
					System.out.println("무음 해제");
				}
			}
		};
	}
}

