package project.enums;

import java.util.HashMap;
import java.util.Map;

public enum PieceConversion {
    KING(5, 'e'),
    QUEEN(4, 'd'),
    ROOK1(1, 'a'),
    ROOK2(8, 'h'),
    BISHOP1(3, 'c'),
    BISHOP2(6, 'f'),
    HORSE1(2, 'b'),
    HORSE2(7, 'g'),
    PAWN1(9, 'i'),
    PAWN2(10, 'j'),
    PAWN3(11, 'k'),
    PAWN4(12, 'l'),
    PAWN5(13, 'm'),
    PAWN6(14, 'n'),
    PAWN7(15, 'o'),
    PAWN8(16, 'p');

    private final int numericValue;
    private final char charValue;

    PieceConversion(int numericValue, char charValue) {
        this.numericValue = numericValue;
        this.charValue = charValue;
    }

    public int getNumericValue() {
        return numericValue;
    }

    public char getCharValue() {
        return charValue;
    }

    private static String generateKey(PieceType type, int index) {
        return type.toString() + index;
    }

    private static final Map<String, PieceConversion> lookup = new HashMap<>();

    static {
        lookup.put(generateKey(PieceType.KING, 1), KING);
        lookup.put(generateKey(PieceType.QUEEN, 1), QUEEN);
        lookup.put(generateKey(PieceType.ROOK, 1), ROOK1);
        lookup.put(generateKey(PieceType.ROOK, 2), ROOK2);
        lookup.put(generateKey(PieceType.BISHOP, 1), BISHOP1);
        lookup.put(generateKey(PieceType.BISHOP, 2), BISHOP2);
        lookup.put(generateKey(PieceType.HORSE, 1), HORSE1);
        lookup.put(generateKey(PieceType.HORSE, 2), HORSE2);
        lookup.put(generateKey(PieceType.PAWN, 1), PAWN1);
        lookup.put(generateKey(PieceType.PAWN, 2), PAWN2);
        lookup.put(generateKey(PieceType.PAWN, 3), PAWN3);
        lookup.put(generateKey(PieceType.PAWN, 4), PAWN4);
        lookup.put(generateKey(PieceType.PAWN, 5), PAWN5);
        lookup.put(generateKey(PieceType.PAWN, 6), PAWN6);
        lookup.put(generateKey(PieceType.PAWN, 7), PAWN7);
        lookup.put(generateKey(PieceType.PAWN, 8), PAWN8);
    }

    public static PieceConversion fromPieceTypeAndIndex(PieceType type, int index) {
        String key = generateKey(type, index);
        PieceConversion conversion = lookup.get(key);
        if (conversion == null) {
            throw new IllegalArgumentException("Invalid piece type or index: " + type + ", " + index);
        }

        return conversion;
    }
}
