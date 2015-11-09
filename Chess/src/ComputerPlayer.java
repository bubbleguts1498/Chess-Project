import java.util.List;

public class ComputerPlayer implements Player {

	@Override
	public Move yourMove(Board board) {
		// TODO make this smarter
		List<Move> moves = board.possibleMoves();
		return moves.get(0);
	}

}
