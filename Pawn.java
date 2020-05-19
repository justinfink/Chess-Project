/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public class Pawn extends ChessPiece {
	public Pawn(boolean white)
	{
		super(white);
	}
	
	public boolean canMove(ChessBoard board, Square start, Square end) {
		if (end.getPiece().isWhite() == this.isWhite()) {
			return false;
		}
		
		int x = Math.abs(start.getX() - end.getY());
		int y = Math.abs(start.getY() - end.getY());
		
		if (end.getPiece().isWhite() != this.isWhite() && x*y == 1) {
			return true;
		}
		
		if (start.getY() != 1 && start.getX() != 6) {
			if (y == 2 && x == 0) {
				return false;
			}
		}
		
		return (y == 1 && x == 0); // sets up pawn movements
	}
	
	
}