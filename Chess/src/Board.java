import java.util.List;
import java.util.ArrayList;

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
				} else if ((row == 0 && col == 0) || (row == 0 && col == 7) || (row == 7 && col == 7)
						|| (row == 7 && col == 0)) {
					piece = Piece.rook;
				} else if ((row == 0 && col == 1) || (row == 0 && col == 6) || (row == 7 && col == 1)
						|| (row == 7 && col == 6)) {
					piece = Piece.knight;
				} else if ((row == 0 && col == 2) || (row == 0 && col == 5) || (row == 7 && col == 2)
						|| (row == 7 && col == 5)) {
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
		return s;
	}

	public Color whichColorMoves() {
		return currentColor;
	}

	public void processMove(Move move) {
		squares[move.endRow][move.endCol].piece = squares[move.startRow][move.startCol].piece;
		squares[move.endRow][move.endCol].color = squares[move.startRow][move.startCol].color;
		squares[move.startRow][move.startCol].piece = null;
		squares[move.startRow][move.startCol].color = null;
		if (currentColor == Color.white) {
			currentColor = Color.black;
		} else {
			currentColor = Color.white;
		}

	}

	public List<Move> possibleMoves() {

		List<Move> moves = new ArrayList<Move>();

		for (int row = 0; row < squares.length; row++) {
			for (int col = 0; col < squares.length; col++) {
				Square startSquare = squares[row][col];

				if (currentColor == startSquare.color) {
					addPossibleMoves(row, col, startSquare.piece, moves);
				}

			}
		}

		return moves;
	}

	private void addPossibleMoves(int startRow, int startCol, Piece piece, List<Move> moves) {

		if (piece == Piece.pawn) {
			addPossiblePawnMoves(startRow, startCol, moves);
		} else if (piece == Piece.rook) {
			addPossibleRookMoves(startRow, startCol, moves);
		} else if (piece == Piece.knight) {
			addPossibleKnightMoves(startRow, startCol, moves);
		} else if (piece == Piece.bishop) {
			addPossibleBishopMoves(startRow, startCol, moves);
		} else if (piece == Piece.king) {
			addPossibleKingMoves(startRow, startCol, moves);
		} else if (piece == Piece.queen) {
			addPossibleQueenMoves(startRow, startCol, moves);
		}
	}

	private void addPossibleQueenMoves(int startRow, int startCol, List<Move> moves) {

		// TODO Auto-generated method stub

	}

	private void addPossibleKingMoves(int startRow, int startCol, List<Move> moves) {
		// TODO Auto-generated method stub

	}

	private void addPossibleBishopMoves(int startRow, int startCol, List<Move> moves) {
		// TODO Auto-generated method stub

	}

	private void addPossibleKnightMoves(int startRow, int startCol, List<Move> moves) {
		// TODO Auto-generated method stub

	}

	private void addPossibleRookMoves(int startRow, int startCol, List<Move> moves) {

		// TODO Auto-generated method stub

	}

	private void addPossiblePawnMoves(int startRow, int startCol, List<Move> moves) {
		if (currentColor == Color.white) {
			if (startRow < 7 && squares[startRow + 1][startCol].piece == null) {
				moves.add(new Move(startRow, startCol, startRow + 1, startCol));
			}
			// TODO add two-move forward
			// TODO add capture diagonally
		} else if (currentColor == Color.black) {
			if (startRow > 0 && squares[startRow - 1][startCol].piece == null) {
				moves.add(new Move(startRow, startCol, startRow - 1, startCol));
			}
			// TODO add two-move forward
			// TODO add capture diagonally
		}

	}

}
