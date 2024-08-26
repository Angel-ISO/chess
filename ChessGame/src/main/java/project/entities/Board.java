package project.entities;

import project.Helpers.BoardHelper;
import project.interfaces.Strategy;
import project.pieces.Piece;
import java.util.*;

public class Board  {
    private static final int SIZE = 8;
    private final Piece[][] board;
    private final BoardHelper boardHelper;

    public Board() {
        this.board = new Piece[SIZE][SIZE];
        this.boardHelper = new BoardHelper(this);
    }

    public int getSize() {
        return SIZE;
    }

    public void putPiece(Piece piece, int row, int column) {
        if (boardHelper.isValidPosition(row, column)) {
            board[row][column] = piece;
        } else {
            throw new IllegalArgumentException("Posición fuera del tablero");
        }
    }

    public List<Piece> randomLocation(List<Piece> pieces) {
        List<Piece> shuffledPieces = new ArrayList<>(pieces);
        Collections.shuffle(shuffledPieces);

        return shuffledPieces;
    }

    public void showBoard() {
        boardHelper.printBoard();
    }

    public void swapPieces(int pos1, int pos2) {
        boardHelper.swapPieces(pos1, pos2);
    }

    public int[] getNumericRepresentation() {

        return boardHelper.getNumericRepresentation();
    }

    public char[] getCharRepresentation() {

        return boardHelper.getCharRepresentation();
    }

    public <T extends Comparable<T>> void orderPieces(List<T> pieces, Strategy strategy) {
        strategy.sort(pieces, this);
    }


    public Piece[][] getBoard() {

        return board;
    }
}