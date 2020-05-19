/*
 * Justin Fink 1214435027
 * CSE 205 T Th 4:30pm
 * Final Project Chess Program
 */

public class Game { 
    private ChessPlayer[] chessPlayers; 
    private ChessBoard chessBoard; 
    private ChessPlayer turn; 
    private GameStatus status; 
  
    private void startGame(ChessPlayer player1, ChessPlayer player2) 
    { 
        chessPlayers[0] = player1; 
        chessPlayers[1] = player2; 
  
        chessBoard.resetChessBoard(); 
  
        if (player1.isWhite()) { 
            this.turn = player1; 
        } 
        
        else { 
            this.turn = player2; 
        }  
    } 
  
    public GameStatus getStatus() 
    { 
        return this.status; 
    } 
  
    public void setStatus(GameStatus status) 
    { 
        this.status = status; 
    } 
  
    public boolean canMove(ChessPlayer player, int startX,  
                                int startY, int endX, int endY) 
    { 
        Square startSquare = chessBoard.getSquare(startX, startY); 
        Square endSquare = chessBoard.getSquare(startY, endY); 
        Move move = new Move(player, startSquare, endSquare); 
        return this.makeMove(move, player); 
    } 
  
    private boolean makeMove(Move move, ChessPlayer player)
    { 
        ChessPiece movingPiece = move.getStart().getPiece(); 
        
        if (movingPiece == null) { 
            return false; 
        } 
  
        if (player != turn) { 
            return false; 
        } 
  
        if (movingPiece.isWhite() != player.isWhite()) { 
            return false; 
        } 
   
        if (!movingPiece.canMove(chessBoard, move.getStart(),  
                                            move.getEnd())) { 
            return false; 
        } 
  
        ChessPiece destPiece = move.getStart().getPiece(); 
        if (destPiece != null) { 
            destPiece.setCaptured(true); 
            move.setPieceCaptured(destPiece); 
        }  
   
        move.getEnd().setPiece(move.getStart().getPiece()); 
        move.getStart().setPiece(null); 
  
        if (destPiece != null && destPiece instanceof King) { 
            if (player.isWhite()) { 
                this.setStatus(GameStatus.WHITE); 
            } 
            else { 
                this.setStatus(GameStatus.BLACK); 
            } 
        } 

        if (this.turn == chessPlayers[0]) { 
            this.turn = chessPlayers[1]; 
        } 
        else { 
            this.turn = chessPlayers[0]; 
        } 
  
        return true; 
    } 
} 