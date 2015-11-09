import java.util.List;

public class Board {
	Color currentColor = Color.white;
	Square[][] squares;

	Board() {
		squares = new Square[8][];
		for (int row = 0; row < squares.length; row++) {
			squares[row] = new Square[8];
			for (int col = 0; col < squares.length; col++) {
				Color color = null;
				if (row >= 0 && row <= 1) {
					color = Color.white;
				} else if (row >= 6 && row <= 7) {
					color = Color.black;
				}
				Piece piece = null;
				//TODO set piece to Piece.king, Piece.queen, etc if in the right position. look at both row and col to figure it out
				squares[row][col] = new Square(piece, color);
			}
		}
	}

	public boolean gameIsOver() {
		// TODO Auto-generated method stub
		return false;
	}

	public String getOutcome() {
		// TODO Auto-generated method stub
		return null;

	}

	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	public Color whichColorMoves() {
		// TODO Auto-generated method stub
		return null;
	}

	public void processMove(Move move) {
		// TODO Auto-generated method stub

	}

	public List<Move> possibleMoves() {
		// TODO Auto-generated method stub
		return null;
	}

}
