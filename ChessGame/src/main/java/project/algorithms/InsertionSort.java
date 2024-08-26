package project.algorithms;

import project.entities.Board;
import project.entities.PieceFactory;
import project.interfaces.Strategy;
import project.pieces.Piece;

import java.util.List;

public class InsertionSort implements Strategy {
    private final String color;
    private final int delay;

    public InsertionSort(String color, int delay) {
        this.color = color;
        this.delay = delay;
    }

    @Override
    public <T extends Comparable<T>> void sort(List<T> items, Board board) {
        for (int i = 1; i < items.size(); i++) {
            T key = items.get(i);
            int j = i - 1;

            while (j >= 0 && items.get(j).compareTo(key) > 0) {
                items.set(j + 1, items.get(j));
                j--;
            }
            items.set(j + 1, key);

            updateBoard(items, board);

            System.out.println("Iteración " + i + ": " + items);
            board.showBoard();
            System.out.println();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Sorting interrupted");
            }
        }
    }

    private <T> void updateBoard(List<T> items, Board board) {
        int index = 0;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if (index < items.size()) {
                    Piece piece = getPieceFromItem(items.get(index));
                    board.putPiece(piece, row, col);
                    index++;
                } else {
                    board.putPiece(null, row, col);
                }
            }
        }
    }

    private <T> Piece getPieceFromItem(T item) {
        List<Piece> pieces;
        if (item instanceof Integer) {
            int number = (Integer) item;
            pieces = PieceFactory.generatePieces(color, 16, "numeric");
            int[] numericPieces = PieceFactory.convertToNumeric(pieces);
            for (int i = 0; i < numericPieces.length; i++) {
                if (numericPieces[i] == number) {
                    return pieces.get(i);
                }
            }
        } else if (item instanceof Character) {
            char character = (Character) item;
            pieces = PieceFactory.generatePieces(color, 16, "char");
            char[] charPieces = PieceFactory.convertToChar(pieces);
            for (int i = 0; i < charPieces.length; i++) {
                if (charPieces[i] == character) {
                    return pieces.get(i);
                }
            }
        }
        throw new IllegalArgumentException("Tipo de elemento no soportado");
    }
}
