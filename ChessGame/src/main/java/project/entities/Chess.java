package project.entities;

import project.Config.ArgumentsConfig;
import project.Config.ChessConfig;
import project.Config.ReportConfig;
import project.Config.SorterConfig;
import project.pieces.Piece;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Chess {
    private static final Logger logger = Logger.getLogger(Chess.class.getName());

    public static List<String> process(String[] args) {
        ArgumentsConfig argsConfig = new ArgumentsConfig(args);
        List<String> report = new ArrayList<>();

        if (argsConfig.isValid()) {
            SorterConfig sorterConfig = new SorterConfig(argsConfig.getSortingAlgorithm(), argsConfig.getColor(), argsConfig.getDelay());
            ChessConfig chessConfig = new ChessConfig(argsConfig.getColor(), argsConfig.getNumberOfPieces(), argsConfig.getPieceType());
            chessConfig.initializeBoard();

            Board board = chessConfig.getBoard();
            List<Piece> pieces = chessConfig.getPieces();

            report.add("Ordenamiento: " + ReportConfig.getSortingAlgorithmReport(argsConfig.getSortingAlgorithm()));
            report.add("Tipo: " + ReportConfig.getPieceTypeReport(argsConfig.getPieceType()));
            report.add("Color: " + ReportConfig.getColorReport(argsConfig.getColor()));

            report.add("Estado inicial del tablero:");
            report.add("orden inicial desordenado: " + pieces);
            board.showBoard();

            if (argsConfig.getPieceType().equals("n")) {
                int[] numericRepresentation = board.getNumericRepresentation();
                report.add("\nOrdenando piezas (numérico)...");
                List<Integer> numericList = Arrays.stream(numericRepresentation).boxed().collect(Collectors.toList());
                board.orderPieces(numericList, sorterConfig.getStrategy());
                report.add("\nel resultado es el siguiente:");
                report.add("Ordenamiento: " + numericList);
            } else {
                char[] charRepresentation = board.getCharRepresentation();
                report.add("\nOrdenando piezas (carácter)...");
                List<Character> charList = new ArrayList<>();
                for (char c : charRepresentation) {
                    charList.add(c);
                }
                board.orderPieces(charList, sorterConfig.getStrategy());
                report.add("\nel resultado es el siguiente:");
                report.add("Ordenamiento: " + charList);
            }

            board.showBoard();
        } else {
            report.add("Ordenamiento: " + ReportConfig.getSortingAlgorithmReport(argsConfig.getSortingAlgorithm()));
            report.add("Tipo: " + ReportConfig.getPieceTypeReport(argsConfig.getPieceType()));
            report.add("Color: " + ReportConfig.getColorReport(argsConfig.getColor()));
            report.add("Valores Invalidos");
        }

        logger.info("Finishing application..");
        return report;
    }
}