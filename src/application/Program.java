package application;


import boardgame.Position;
import chess.ChessMatch;
import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMatch = new ChessMatch();
		Ui.printBoard(chessMatch.getPieces());
		

	}

}