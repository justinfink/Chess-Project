/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public class Move { 
    private Square start;
    private Square end;
	private ChessPiece pieceMoved; 
	private ChessPiece pieceCaptured; 
  
    public Move(ChessPlayer player, Square start, Square end) 
    { 
        this.setPieceMoved(start.getPiece()); 
    } 
  
	public ChessPiece getPieceMoved() {
		return pieceMoved;
	}

	public void setPieceMoved(ChessPiece pieceMoved) {
		this.pieceMoved = pieceMoved;
	} 
	
	public Square getStart() {
		return start;
	}
	
	public Square getEnd() {
		return end;
	}
	
	public ChessPiece getPieceCaptured() {
		return pieceCaptured;
	}
	
	public void setPieceCaptured(ChessPiece piece) {
		this.pieceCaptured = piece;
	}
} 