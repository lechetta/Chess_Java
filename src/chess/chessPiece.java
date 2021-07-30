package chess;

import BoardGame.Board;
import BoardGame.Piece;

public class chessPiece extends Piece {

		private color Color;

		public chessPiece(Board board, color color) {
			super(board);
			Color = color;
		}

		public color getColor() {
			return Color;
		}
		
		
		
		
}
