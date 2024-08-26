package project.entities;
import project.Helpers.FactoryHelper;
import project.pieces.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class PieceFactory {

    private static final Map<Integer, Runnable> pieceConfigurations = new HashMap<>();

    public static List<Piece> generatePieces(String color, int numberOfPieces, String type) {
        List<Piece> pieces = new ArrayList<>();
        if (numberOfPieces == 16) {
            addAllPieces(color, pieces);
        } else {
            addSpecificPieces(color, numberOfPieces, pieces);
        }
        return pieces;
    }

    private static void addAllPieces(String color, List<Piece> pieces) {
        pieces.add(new King(color));
        pieces.add(new Queen(color));
        pieces.add(new Rook(color));
        pieces.add(new Bishop(color));
        pieces.add(new Horse(color));
        pieces.add(new Rook(color));
        pieces.add(new Bishop(color));
        pieces.add(new Horse(color));
        for (int i = 0; i < 8; i++) {
            pieces.add(new Pawn(color));
        }
    }

    private static void addSpecificPieces(String color, int numberOfPieces, List<Piece> pieces) {
        pieceConfigurations.put(1, () -> pieces.add(new King(color)));
        pieceConfigurations.put(2, () -> {
            pieces.add(new King(color));
            pieces.add(new Queen(color));
        });
        pieceConfigurations.put(4, () -> {
            pieces.add(new King(color));
            pieces.add(new Queen(color));
            pieces.add(new Bishop(color));
            pieces.add(new Bishop(color));
        });
        pieceConfigurations.put(6, () -> {
            pieces.add(new King(color));
            pieces.add(new Queen(color));
            pieces.add(new Bishop(color));
            pieces.add(new Bishop(color));
            pieces.add(new Horse(color));
            pieces.add(new Horse(color));
        });
        pieceConfigurations.put(8, () -> {
            pieces.add(new King(color));
            pieces.add(new Queen(color));
            pieces.add(new Bishop(color));
            pieces.add(new Bishop(color));
            pieces.add(new Horse(color));
            pieces.add(new Horse(color));
            pieces.add(new Rook(color));
            pieces.add(new Rook(color));
        });
        pieceConfigurations.put(10, () -> {
            pieces.add(new King(color));
            pieces.add(new Queen(color));
            pieces.add(new Bishop(color));
            pieces.add(new Bishop(color));
            pieces.add(new Horse(color));
            pieces.add(new Horse(color));
            pieces.add(new Rook(color));
            pieces.add(new Rook(color));
            pieces.add(new Pawn(color));
            pieces.add(new Pawn(color));
        });

        Runnable configuration = pieceConfigurations.get(numberOfPieces);
        if (configuration != null) {
            configuration.run();
        } else if (numberOfPieces == 16) {
            addAllPieces(color, pieces);
        } else {
            throw new IllegalArgumentException("Número de piezas no soportado.");
        }
    }

    public static int[] convertToNumeric(List<Piece> pieces) {

        return FactoryHelper.convertToNumeric(pieces);
    }

    public static char[] convertToChar(List<Piece> pieces) {

        return FactoryHelper.convertToChar(pieces);
    }

    private static int getPieceIndex(Piece piece, List<Piece> pieces) {

        return FactoryHelper.getPieceIndex(piece, pieces);
    }
}