package project.Helpers;

import project.enums.PieceConversion;
import project.pieces.Piece;

import java.util.List;

public class FactoryHelper {
    public static int[] convertToNumeric(List<Piece> pieces) {
        int[] numericValues = new int[pieces.size()];
        for (int i = 0; i < pieces.size(); i++) {
            Piece piece = pieces.get(i);
            int index = getPieceIndex(piece, pieces);
            PieceConversion conversion = PieceConversion.fromPieceTypeAndIndex(piece.getType(), index);
            numericValues[i] = conversion.getNumericValue();
        }
        return numericValues;
    }

    public static char[] convertToChar(List<Piece> pieces) {
        char[] charValues = new char[pieces.size()];
        for (int i = 0; i < pieces.size(); i++) {
            Piece piece = pieces.get(i);
            int index = getPieceIndex(piece, pieces);
            PieceConversion conversion = PieceConversion.fromPieceTypeAndIndex(piece.getType(), index);
            charValues[i] = conversion.getCharValue();
        }
        return charValues;
    }

    public static int getPieceIndex(Piece piece, List<Piece> pieces) {
        int count = 0;
        for (Piece p : pieces) {
            if (p.getType() == piece.getType()) {
                count++;
            }
            if (p == piece) {
                return count;
            }
        }
        return count;
    }
}
