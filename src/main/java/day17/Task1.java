package day17;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece pawn = ChessPiece.PAWN_WHITE;
        ChessPiece rook = ChessPiece.ROOK_BLACK;

        for (int i = 0; i < 4; i++) {
            System.out.print(pawn.getFigure());
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(rook.getFigure());
        }
    }
}