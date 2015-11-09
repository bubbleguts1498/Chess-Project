
public class Main {

	public static void main(String[] args) {
		Player white = new HumanPlayer();
		Player black = new ComputerPlayer();
		Game game = new Game(white, black);
		game.run();
	}

}
