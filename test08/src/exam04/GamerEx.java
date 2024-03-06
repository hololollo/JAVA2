package exam04;

public class GamerEx {

	public static void main(String[] args) {
		Gamer game;
		
		game = new Amateur();
		game.run(20);
		game.jump(10);
		game.turn(5);
		game.show("good");
		
		game = new Progamer();
		game.run(10);
		game.jump(10);
		game.turn(10);
		game.show("good");
		
		
	}

}
