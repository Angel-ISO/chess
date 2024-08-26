package project.pieces;

import project.enums.PieceType;

public class Queen extends Piece {
    public Queen(String color) {
        super(color, PieceType.QUEEN, "Q");
    }
}
