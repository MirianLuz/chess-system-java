package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Collor;

public class King extends ChessPiece {

	public King(Board board, Collor collor) {
		super(board, collor);
	}
	
	@Override
	public String toString() {
		return "K";
	}

}
