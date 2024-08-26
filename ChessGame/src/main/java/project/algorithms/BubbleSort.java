package project.algorithms;

import project.entities.Board;
import project.interfaces.Strategy;

import java.util.List;

public class BubbleSort implements Strategy {
    private final int delay;

    public BubbleSort(int delay) {
        this.delay = delay;
    }

    @Override
    public <T extends Comparable<T>> void sort(List<T> items, Board board) {
        boolean swapped;
        for (int i = 0; i < items.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < items.size() - i - 1; j++) {
                if (items.get(j).compareTo(items.get(j + 1)) > 0) {
                    T temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);

                    board.swapPieces(j, j + 1);

                    System.out.println("Iteración " + (i + 1) + ": " + items);
                    board.showBoard();
                    System.out.println();

                    swapped = true;

                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Sorting interrupted");
                    }
                }
            }
            if (!swapped) break;
        }
    }
}
