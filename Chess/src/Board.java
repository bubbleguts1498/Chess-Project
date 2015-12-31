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
				if (row == 1 || row == 6) {
					piece = Piece.pawn;
				} else if ((row == 0 && col == 0) || (row == 0 && col == 7) || (row == 7 && col == 7) || (row == 7 && col == 0)) {
					piece = Piece.rook;
				} else if ((row == 0 && col == 1) || (row == 0 && col == 6) || (row == 7 && col == 1) || (row == 7 && col == 6)) {
					piece = Piece.knight;
				} else if ((row == 0 && col == 2) || (row == 0 && col == 5) || (row == 7 && col == 2) || (row == 7 && col == 5)) {
					piece = Piece.bishop;
				} else if ((row == 0 && col == 4) || (row == 7 && col == 4)) {
					piece = Piece.king;
				} else if ((row == 0 && col == 3) || (row == 7 && col == 3)) {
					piece = Piece.queen;
				}
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
		String s = "";
		for (int row = 0; row < squares.length; row++) {
			for (int col = 0; col < squares.length; col++) {
				Square square = squares[row][col];
				String squareString = "-";
				if (square.piece == Piece.pawn) {
					squareString = "P";
				} else if (square.piece == Piece.rook) {
					squareString = "R";
				} else if (square.piece == Piece.knight) {
					squareString = "N";
				} else if (square.piece == Piece.bishop) {
					squareString = "B";
				} else if (square.piece == Piece.king) {
					squareString = "K";
				} else if (square.piece == Piece.queen) {
					squareString = "Q";
				}
				if (square.color == Color.black) {
					squareString = squareString.toLowerCase();
				}
				s += squareString;
				s += " ";
			}
			s += "\n";
		}
		// TODO Auto-generated method stub
		return s;
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
