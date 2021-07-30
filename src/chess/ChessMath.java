package chess;

import BoardGame.Board;

public class ChessMath {

	private Board board;
	
	public ChessMath() {
		board = new Board(8, 8);
		
	}
	
	public chessPiece[][] getPieces(){
		chessPiece[][] mat = new chessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (chessPiece) board.piece(i, j);
				
			}
			
		}
		return mat;
	}
}
