package project.Helpers;

import project.entities.Board;
import project.entities.PieceFactory;
import project.pieces.Piece;

import java.util.ArrayList;
import java.util.List;

public class BoardHelper {
    private static final int SIZE = 8;
    private final Board boardInstance;

    public BoardHelper(Board boardInstance) {
        this.boardInstance = boardInstance;
    }

    public boolean isValidPosition(int row, int column) {

        return row >= 0 && row < SIZE && column >= 0 && column < SIZE;
    }


    public List<Piece> getPiecesInRowOrder() {
        List<Piece> pieces = new ArrayList<>();
        Piece[][] board = boardInstance.getBoard();
        for (Piece[] row : board) {
            for (Piece piece : row) {
                if (piece != null) {
                    pieces.add(piece);
                }
            }
        }

        return pieces;
    }

    public void swapPieces(int pos1, int pos2) {
        Piece[][] board = boardInstance.getBoard();
        int row1 = pos1 / SIZE;
        int col1 = pos1 % SIZE;
        int row2 = pos2 / SIZE;
        int col2 = pos2 % SIZE;

        Piece temp = board[row1][col1];
        board[row1][col1] = board[row2][col2];
        board[row2][col2] = temp;
    }

    public int[] getNumericRepresentation() {
        List<Piece> pieces = getPiecesInRowOrder();
        return PieceFactory.convertToNumeric(pieces);
    }

    public char[] getCharRepresentation() {
        List<Piece> pieces = getPiecesInRowOrder();
        return PieceFactory.convertToChar(pieces);
    }

    public void printBoard() {
        final int cellWidth = 4;

        printColumnHeaders(cellWidth);
        for (int i = 0; i < SIZE; i++) {
            printRow(i, cellWidth);
        }
        printColumnFooters();
    }

    private void printColumnHeaders(int cellWidth) {
        System.out.print("  ");
        for (char column = 'a'; column <= 'h'; column++) {
            System.out.print("+");
            System.out.print("-".repeat(cellWidth));
        }
        System.out.println("+");
    }

    private void printRow(int rowIndex, int cellWidth) {
        System.out.print((SIZE - rowIndex) + " ");
        Piece[][] board = boardInstance.getBoard();
        for (int colIndex = 0; colIndex < SIZE; colIndex++) {
            System.out.print("|");
            String cellContent = (board[rowIndex][colIndex] == null) ? " " : board[rowIndex][colIndex].toString();
            System.out.print(formatCellContent(cellContent, cellWidth));
        }
        System.out.println("|");
        printRowDivider(cellWidth);
    }

    private void printRowDivider(int cellWidth) {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("+");
            System.out.print("-".repeat(cellWidth));
        }
        System.out.println("+");
    }

    private void printColumnFooters() {
        System.out.print("  ");
        for (char column = 'a'; column <= 'h'; column++) {
            System.out.print(" " + column + "  ");
        }
        System.out.println();
    }

    private String formatCellContent(String content, int cellWidth) {
        int padding = cellWidth - content.length() - 1;

        return content + " ".repeat(Math.max(padding, 0));
    }
}
