/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public class Rook extends ChessPiece {
	public Rook(boolean white)
	{
		super(white); // extends color from parent class
	}
	
	public boolean canMove(ChessBoard board, Square start, Square end) {
		if (end.getPiece().isWhite() == this.isWhite()) {
			return false;
		}
		
		int x = Math.abs(start.getX() - end.getY());
		int y = Math.abs(start.getY() - end.getY());
		
		return(x * y == 0); // either the x or y total should be zero to move in a straight line
	}
}