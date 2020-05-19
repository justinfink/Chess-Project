/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public class Square { 
    private ChessPiece piece; 
    private int x; 
    private int y; 
  
    public Square(int x, int y, ChessPiece piece) //A square knows its coordinates and occupant
    { 
        this.setPiece(piece); 
        this.setX(x); 
        this.setY(y); 
    } 
  
    public ChessPiece getPiece() 
    { 
        return this.piece; 
    } 
  
    public void setPiece(ChessPiece piece) 
    { 
        this.piece = piece; 
    } 
  
    public int getX() // coordinates are set and returned one at a time
    { 
        return this.x; 
    } 
  
    public void setX(int x) 
    { 
        this.x = x; 
    } 
  
    public int getY() 
    { 
        return this.y; 
    } 
  
    public void setY(int y) 
    { 
        this.y = y; 
    } 
} 