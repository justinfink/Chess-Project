/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public abstract class ChessPlayer { 
    public boolean side; 
    public boolean human; 
  
    public boolean isWhite() 
    { 
        return this.side == true; 
    } 
    public boolean isHumanPlayer() 
    { 
        return this.human == true; 
    } 
} 