package session3.B_DesignWithInheritance;

public class ChessDemo {

    public static void main(String[] args) {
        //Create the Chess Board
        ChessBoard chessBoard = new ChessBoard();

        ChessPiece blackKing = new ChessPiece(chessBoard, "King", "Black", 0, 2);

        System.out.println(blackKing.getColor());

        System.out.println(chessBoard.moveChessPiece(blackKing, 0,3));

        ChessPiece blackQueen = new ChessPiece(chessBoard,"Queen", "Black", 0, 1);

        System.out.println(chessBoard.moveChessPiece(blackQueen, 6,1));


     }
}
