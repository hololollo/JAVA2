package sec2;

public class RemoteExam2 {

	public static void main(String[] args) {
		Screen s1 = new Screen() {

			int volume;
			int lightness;
			int zoom;
			
			public void turnOff() {
				System.out.println("빔프로젝트 전원 OFF");
			}

			public void turnOn() {
				System.out.println("빔프로젝트 전원 ON");

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

			public int light() {
				System.out.println("밝게");
				if(this.lightness < 255 && this.lightness > 0) { // 최대밝기 : 255
					this.lightness++;
				}
				return this.lightness;
			}

			public int dark() {
				System.out.println("어둡게");
				if(this.lightness < 255 && this.lightness > 0) { // 최대밝기 : 255
					this.lightness--;
				}
				return this.lightness;
			}

			public int zoomin() {
				System.out.println("50% 확대");
				if(this.zoom>=-500 && this.zoom <= 500) {
					this.zoom+=50; // 5배
				}
				return this.zoom;
			}

			public int zoomout() {
				System.out.println("50% 축소");
				if(this.zoom>=-500 && this.zoom <= 500) {
					this.zoom-=50; // 5배
				}
				return this.zoom;
			}
		};
		
		RemoteControl.changeBattery();
		s1.turnOn();
		s1.light();
		s1.light();
		s1.dark();
		s1.zoomin();
		s1.zoomin();
		s1.zoomout();
		s1.setVolume(4); // 최대 : 10
		s1.setMute(true);
		s1.setMute(false);
		s1.turnOff();
	}
}
