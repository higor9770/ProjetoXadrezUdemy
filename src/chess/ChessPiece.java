package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece { // Classe PeçaXadrez herdando métodos Piece e Boards do pacote boardgame

	private Color color;
	private int moveCount;

	public ChessPiece(Board board, Color color) { //Construtor se baseando nas variáveis de piece e board (boardgame)
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	/*public void setColor(Color color) {
	this.color = color;   É obrigado tirar essa SET para que nosso tabuleiro não possa ser modificado
}*/
	
	public int getMoveCount() {
		return moveCount;
	}
	
	protected void increaseMoveCount() {
		moveCount++;
	}

	protected void decreaseMoveCount() {
		moveCount--;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece)getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
}
