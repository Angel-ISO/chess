package project.Config;

import project.entities.Board;
import project.entities.PieceFactory;
import project.pieces.Piece;
import java.util.List;
public class ChessConfig {
    private final Board board;
    private final List<Piece> pieces;

    public ChessConfig(String color, int numberOfPieces, String pieceType) {
        this.board = new Board();
        this.pieces = PieceFactory.generatePieces(color, numberOfPieces, pieceType);
    }

    public void initializeBoard() {
        List<Piece> randomPieces = board.randomLocation(pieces);
        int row = 0;
        int col = 0;
        for (Piece piece : randomPieces) {
            board.putPiece(piece, row, col);
            col++;
            if (col >= 8) {
                col = 0;
                row++;
            }
        }
    }

    public Board getBoard() {
        return board;
    }

    public List<Piece> getPieces() {
        return pieces;
    }
}

