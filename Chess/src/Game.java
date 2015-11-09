
public class Game {

	private Player whitePlayer;
	private Player blackPlayer;
	private Board board;

	public Game(Player white, Player black) {
		this.whitePlayer = white;
		this.blackPlayer = black;
		this.board = new Board();
	}

	public void run() {
		while (!board.gameIsOver()) {
			performAMove();
		}
		System.out.println("outcome: " + board.getOutcome());
	}

	private void performAMove() {
		Player curPlayer = getCurrentPlayer();
		System.out.println(board.toString());
		Move move = curPlayer.yourMove(board);
		System.out.println(board.whichColorMoves() + " moves " + move.toString());
		board.processMove(move);
	}

	private Player getCurrentPlayer() {
		Color color = board.whichColorMoves();
		if (color == Color.black) {
			return blackPlayer;
		} else {
			return whitePlayer;
		}
	}
}
