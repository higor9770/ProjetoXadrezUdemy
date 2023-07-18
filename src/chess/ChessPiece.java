package chess;


import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{ // Classe PeçaXadrez herdando métodos Piece e Boards do pacote boardgame

	private Color color;

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
	
	
	
	
	
}
