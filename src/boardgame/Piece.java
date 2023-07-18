package boardgame;

public abstract class Piece {

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
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	
	
	}
}
