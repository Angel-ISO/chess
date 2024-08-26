package project.algorithms;

import project.entities.Board;
import project.interfaces.Strategy;
import java.util.List;

public class QuickSort implements Strategy {

    private final int delay;

    public QuickSort(int delay) {
        this.delay = delay;
    }
    @Override
    public <T extends Comparable<T>> void sort(List<T> items, Board board) {
        quickSort(items, 0, items.size() - 1, board);
    }

    private <T extends Comparable<T>> void quickSort(List<T> items, int low, int high, Board board) {
        if (low < high) {
            int pi = partition(items, low, high, board);
            System.out.println("Partición en el índice " + pi + ": " + items);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Sorting interrupted");
            }

            quickSort(items, low, pi - 1, board);
            quickSort(items, pi + 1, high, board);
        }
    }

    private <T extends Comparable<T>> int partition(List<T> items, int low, int high, Board board) {
        T pivot = items.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (items.get(j).compareTo(pivot) < 0) {
                i++;
                T temp = items.get(i);
                items.set(i, items.get(j));
                items.set(j, temp);

                board.swapPieces(i, j);

                System.out.println("Intercambio en índices " + i + " y " + j + ": " + items);
                board.showBoard();
                System.out.println();

                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Sorting interrupted");
                }
            }
        }
        T temp = items.get(i + 1);
        items.set(i + 1, items.get(high));
        items.set(high, temp);

        board.swapPieces(i + 1, high);

        System.out.println("Intercambio del pivote en índice " + (i + 1) + ": " + items);
        board.showBoard();
        System.out.println();

        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Sorting interrupted");
        }

        return i + 1;
    }
}

