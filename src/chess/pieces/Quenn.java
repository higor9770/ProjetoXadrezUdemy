package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Quenn extends ChessPiece { // RAINHA

	public Quenn (Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString() {
		return "Q";
	}
	
	

}
