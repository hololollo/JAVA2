package sec2;

public class RemoteExam1 {

	public static void main(String[] args) {
		
		RemoteControl r1;
		
		r1 = new Screen() {
			int volume;
			int light;
			int dark;
			int zoomin;
			int zoomout;
			int lightness;
			int zoom;
		
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
		r1.turnOn();
		r1.setVolume(4); // 최대 : 10
		r1.setMute(true);
		r1.setMute(false);
		r1.turnOff();
	}
}
