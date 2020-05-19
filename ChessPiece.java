/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public abstract class ChessPiece { 
  
    private boolean captured = false; 
    private boolean white = false; 
  
    public ChessPiece(boolean white) 
    { 
        this.setWhite(white); 
    } 
  
    public boolean isWhite() 
    { 
        return this.white == true; 
    } 
  
    public void setWhite(boolean white) 
    { 
        this.white = white; 
    } 
  
    public boolean isCaptured() 
    { 
        return this.captured == true; 
    } 
  
    public void setCaptured(boolean killed) 
    { 
        this.captured = killed; 
    } 
  
    public abstract boolean canMove(ChessBoard board, Square start, Square end); 
} 