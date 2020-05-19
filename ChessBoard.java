/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public class ChessBoard { 
    public Square[][] squares; 
  
    public ChessBoard() 
    { 
        this.resetChessBoard(); 
    } 
  
    public Square getSquare(int x, int y) // Selects a specific square and returns coordinates
    { 
        return squares[x][y]; 
    } 
  
    public void resetChessBoard() // Sets up beginning starting position
    { 
         
    	//set up all of white's pieces
        squares[0][0] = new Square(0, 0, new Rook(true)); 
        squares[0][1] = new Square(0, 1, new Knight(true)); 
        squares[0][2] = new Square(0, 2, new Bishop(true)); 
        squares[0][3] = new Square(0, 2, new Queen(true));
        squares[0][4] = new Square(0, 0, new King(true)); 
        squares[0][5] = new Square(0, 1, new Bishop(true)); 
        squares[0][6] = new Square(0, 2, new Knight(true)); 
        squares[0][7] = new Square(0, 2, new Rook(true));        
        
        for (int i = 0; i < 8; i++) {
        	squares[1][i] = new Square(1, i, new Pawn(true));
        }
  
        // set up all of black's pieces
        squares[7][0] = new Square(7, 0, new Rook(false)); 
        squares[7][1] = new Square(7, 1, new Knight(false)); 
        squares[7][2] = new Square(7, 2, new Bishop(false)); 
        squares[7][3] = new Square(7, 2, new Queen(false));
        squares[7][4] = new Square(7, 0, new King(false)); 
        squares[7][5] = new Square(7, 1, new Bishop(false)); 
        squares[7][6] = new Square(7, 2, new Knight(false)); 
        squares[7][7] = new Square(7, 2, new Rook(false));

        for (int i = 0; i < 8; i++) {
        	squares[6][i] = new Square(1, i, new Pawn(false));
        } 
  
        for (int i = 2; i <= 5; i++) { 
            for (int j = 0; j <= 7; j++) { 
                squares[i][j] = new Square(i, j, null); 
            } 
        } 
    } 
} 