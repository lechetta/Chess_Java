package BoardGame;

public abstract class Piece {

		protected Position position;
		private Board board;
		
		public Piece(Board board) {
			this.board = board;
			//peça recem criada recebe valor nulo
			position = null;
		}

		protected Board getBoard() {
			return board;
		}
		
		
		
		
}
