package project.interfaces;
import project.entities.Board;

import  java.util.List;
public interface Strategy {
   // <T extends Comparable<T>> void sort(List<T> items);
    <T extends Comparable<T>> void sort(List<T> items, Board board);

}
