/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public class Knight extends ChessPiece { 
    public Knight(boolean white) 
    { 
        super(white); 
    } 
  
    @Override
    public boolean canMove(ChessBoard board, Square start, Square end) 
    {  
        if (end.getPiece().isWhite() == this.isWhite()) { 
            return false; 
        } 
  
        int x = Math.abs(start.getX() - end.getX()); 
        int y = Math.abs(start.getY() - end.getY()); 
        
        return x * y == 2; // x change should be 1 or 2, y should be the other value to move in an L shape
    } 
}