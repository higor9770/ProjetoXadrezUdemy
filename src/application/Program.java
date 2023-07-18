package application;


import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;

import java.util.Scanner;

import boardgame.Board;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			Ui.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = Ui.readChessPosition(sc);
			
			System.out.print("Target: ");
			ChessPosition target = Ui.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			
		}
		

	}

}