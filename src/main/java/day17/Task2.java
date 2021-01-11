package day17;

public class Task2 {
    public static void main(String[] args) {

        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece kingWhite = ChessPiece.KING_WHITE;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece knightWhite = ChessPiece.KNIGHT_WHITE;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece empty = ChessPiece.EMPTY;

        char[][] board;
        board = new char[][]{{rookBlack.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure(), rookBlack.getFigure(), kingBlack.getFigure(), empty.getFigure()},
                {empty.getFigure(), rookWhite.getFigure(), empty.getFigure(), empty.getFigure(), pawnBlack.getFigure(), pawnBlack.getFigure(), empty.getFigure(), pawnBlack.getFigure()},
                {pawnBlack.getFigure(), empty.getFigure(), knightBlack.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure(), pawnBlack.getFigure(), empty.getFigure()},
                {queenBlack.getFigure(), empty.getFigure(), empty.getFigure(), bishopWhite.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure()},
                {empty.getFigure(), empty.getFigure(), empty.getFigure(), bishopBlack.getFigure(), pawnWhite.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure()},
                {empty.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure(), bishopWhite.getFigure(), pawnWhite.getFigure(), empty.getFigure(), empty.getFigure()},
                {pawnWhite.getFigure(), empty.getFigure(), empty.getFigure(), queenWhite.getFigure(), empty.getFigure(), pawnWhite.getFigure(), empty.getFigure(), pawnWhite.getFigure()},
                {empty.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure(), empty.getFigure(), rookWhite.getFigure(), kingWhite.getFigure(), empty.getFigure()}};

        ChessBoard chessBoard = new ChessBoard(board);
        chessBoard.print();
    }
}
