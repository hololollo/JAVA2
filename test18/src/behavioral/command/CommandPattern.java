package behavioral.command;
// CommandPattern : 요청을 캡슐화 하여 여러 기능을 실행 할 수 있는 패턴
public class CommandPattern {
	public static void main(String[] args) {
		
		Command com1 = new AlarmCommand(new Alarm()); // 알람커맨드를 생성할때 알람이 필요
		Button btn1 = new Button(com1); // Button(캡슐화) : Alarm과 Lamp의 기능을 합쳐 전달할 수 있게 구현(Command패턴)
		btn1.pressed(true);
		btn1.pressed(false);
		
		com1 = new LampCommand(new Lamp());
		Button btn2 = new Button(com1);
		btn2.pressed(true);
		btn2.pressed(false);
		
	}

}
