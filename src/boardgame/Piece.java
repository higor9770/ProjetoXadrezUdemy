package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null; // não é obrigado referênciar o POSITION como null porque o java já faz isso por padrão
	}

	protected Board getBoard() { // colocando como protected para que outras classes de outro pacote não possam acessar, somente classe do mesmo pacote
		return board;
	}

	/*public void setBoard(Board board) {
		this.board = board;   (É obrigado tirar essa SET para que nosso tabuleiro não possa ser modificado
	}*/
	
	
	
	
	
}
