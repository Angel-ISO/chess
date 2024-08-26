package project.Config;

public class ArgumentsConfig {
    private String sortingAlgorithm = "";
    private String pieceType = "";
    private String color = "";
    private int numberOfPieces = 0;
    private int delay =0;


    public ArgumentsConfig(String[] args) {
        for (String arg : args) {
            String[] parts = arg.split("=");
            if (parts.length != 2) {
                continue;
            }
            String key = parts[0].trim();
            String value = parts[1].trim().toLowerCase();

            switch (key) {
                case "a", "A":
                    sortingAlgorithm = value;
                    break;
                case "t", "T":
                    pieceType = value;
                    break;
                case "c", "C":
                    color = value;
                    break;
                case "r":
                    try {
                        numberOfPieces = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        numberOfPieces = 0;
                    }
                    break;

                case "s", "S":
                    try{
                        delay = Integer.parseInt(value);
                    } catch (NumberFormatException e) {
                        delay = 0;
                    }
                    break;
            }
        }
    }

    public int getDelay() {
        return delay;
    }

    public String getSortingAlgorithm() {
        return sortingAlgorithm;
    }

    public String getPieceType() {
        return pieceType;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public boolean isValid() {
        return isSortingAlgorithmValid() && isPieceTypeValid() && isColorValid() && isNumberOfPiecesValid()&& isDelayValid();
    }

    private boolean isSortingAlgorithmValid() {
        return sortingAlgorithm.equals("b") || sortingAlgorithm.equals("i") || sortingAlgorithm.equals("q");
    }

    private boolean isPieceTypeValid() {
        return pieceType.equals("c") || pieceType.equals("n");
    }

    private boolean isColorValid() {
        return color.equals("b") || color.equals("w");
    }

    private boolean isNumberOfPiecesValid() {
        return numberOfPieces == 1 || numberOfPieces == 2 || numberOfPieces == 4 || numberOfPieces == 6 ||
                numberOfPieces == 8 || numberOfPieces == 10 || numberOfPieces == 16;
    }

    private boolean isDelayValid() {
        return delay >= 100 && delay <= 1000;
    }
}
