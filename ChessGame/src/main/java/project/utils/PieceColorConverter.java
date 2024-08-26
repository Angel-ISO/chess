package project.utils;

import project.enums.PieceType;

import java.util.HashMap;
import java.util.Map;

public class PieceColorConverter {
    private static final Map<PieceType, String> whiteSymbols = new HashMap<>();
    private static final Map<PieceType, String> blackSymbols = new HashMap<>();

    static {
        whiteSymbols.put(PieceType.KING, "♔");
        whiteSymbols.put(PieceType.QUEEN, "♕");
        whiteSymbols.put(PieceType.ROOK, "♖");
        whiteSymbols.put(PieceType.BISHOP, "♗");
        whiteSymbols.put(PieceType.HORSE, "♘");
        whiteSymbols.put(PieceType.PAWN, "♙");

        blackSymbols.put(PieceType.KING, "♚");
        blackSymbols.put(PieceType.QUEEN, "♛");
        blackSymbols.put(PieceType.ROOK, "♜");
        blackSymbols.put(PieceType.BISHOP, "♝");
        blackSymbols.put(PieceType.HORSE, "♞");
        blackSymbols.put(PieceType.PAWN, "♟");
    }

    public static String getSymbol(String color, PieceType type) {
        return switch (color.toLowerCase()) {
            case "w" -> whiteSymbols.get(type);
            case "b" -> blackSymbols.get(type);
            default -> throw new IllegalArgumentException("Invalid color: " + color);
        };
    }
}
