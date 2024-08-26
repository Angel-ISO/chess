package project.Config;

public class ReportConfig {
    public static String getSortingAlgorithmReport(String sortingAlgorithm) {
        return switch (sortingAlgorithm.toLowerCase()) {
            case "b" -> "[Bubble sort]";
            case "i" -> "[Insertion sort]";
            case "q" -> "[Quick sort]";
            default -> "Invalido";
        };
    }

    public static String getPieceTypeReport(String pieceType) {
        return switch (pieceType.toLowerCase()) {
            case "c" -> "[Caracter]";
            case "n" -> "[Numerico]";
            default -> "Invalido";
        };
    }

    public static String getColorReport(String color) {
        return switch (color.toLowerCase()) {
            case "b" -> "[Negras]";
            case "w" -> "[Blancas]";
            default -> "Invalido";
        };
    }
}
