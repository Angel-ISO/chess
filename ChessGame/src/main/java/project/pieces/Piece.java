package project.pieces;

import project.enums.PieceType;
import project.utils.PieceColorConverter;


public abstract class Piece implements Comparable<Piece> {
    private String color;
    private PieceType type;
    private String name;

    public Piece(String color, PieceType type, String name) {
        this.color = color;
        this.type = type;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PieceType getType() {
        return type;
    }

    public void setType(PieceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
            return PieceColorConverter.getSymbol(color, type);
    }

    @Override
    public int compareTo(Piece other) {
        return this.type.compareTo(other.type);
    }
}
