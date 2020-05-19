/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public class King extends ChessPiece {  
  
    public King(boolean white) 
    { 
        super(white); // extends color from parent class
    } 
  
    @Override
    public boolean canMove(ChessBoard board, Square start, Square end) 
    { 
        // set up the king's movements
        if (end.getPiece().isWhite() == this.isWhite()) { 
            return false; 
        } 
  
        int x = Math.abs(start.getX() - end.getX()); 
        int y = Math.abs(start.getY() - end.getY()); 
        
        return (x + y == 1 || x * y == 1);  
    } 
   
} 