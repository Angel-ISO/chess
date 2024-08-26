package project.Config;

import project.algorithms.BubbleSort;
import project.algorithms.InsertionSort;
import project.algorithms.QuickSort;
import project.interfaces.Strategy;

public class SorterConfig {
    private final Strategy strategy;

    public SorterConfig(String sortingAlgorithm, String color, int delay) {
        switch (sortingAlgorithm) {
            case "b", "B":
                this.strategy = new BubbleSort(delay);
                break;
            case "i", "I":
                this.strategy = new InsertionSort(color, delay);
                break;
            case "q", "Q":
                this.strategy = new QuickSort(delay);
                break;
            default:
                this.strategy = null;
        }
    }

    public Strategy getStrategy() {
        return strategy;
    }
}
