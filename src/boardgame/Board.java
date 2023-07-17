package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}

	public Piece piece(int row, int column) { //metodo para retornar a matriz de acordo com a coluna e linha
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()]; // sobrecarga do mesmo método acima só que trazendo o método get
	}
	
	public void placePiece (Piece piece, Position position) { // ele vai na matriz, a partir das linha e colunas colocar as peças de xadrez
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	
	
	
}
