package project.entities;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class ChessTest {
    private final String ORD_C = "Ordenamiento: [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p]";
    private final String ORD_N = "Ordenamiento: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]";

    @Test
    void insertionCharBlack100Test() {
        var args = new String[] {"a=i", "t=c", "c=b", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Insertion sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void insertionCharBlack1000Test() {
        var args = new String[] {"a=i", "t=c", "c=b", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Insertion sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void quickNumberWhite100Test() {
        var args = new String[] {"a=q", "t=n", "c=w", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Quick sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void quickNumberWhite1000Test() {
        var args = new String[] {"a=q", "t=n", "c=w", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Quick sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void bubbleCharBlack100Test() {
        var args = new String[] {"a=b", "t=c", "c=b", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Bubble sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void bubbleCharBlack1000Test() {
        var args = new String[] {"a=b", "t=c", "c=b", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Bubble sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void bubbleNumberWhite100Test() {
        var args = new String[] {"a=b", "t=n", "c=w", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Bubble sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void bubbleNumberWhite1000Test() {
        var args = new String[] {"a=b", "t=n", "c=w", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Bubble sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void insertionCharWhite100Test() {
        var args = new String[] {"a=i", "t=c", "c=w", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Insertion sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void insertionCharWhite1000Test() {
        var args = new String[] {"a=i", "t=c", "c=w", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Insertion sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void quickCharBlack100Test() {
        var args = new String[] {"a=q", "t=c", "c=b", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Quick sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void quickCharBlack1000Test() {
        var args = new String[] {"a=q", "t=c", "c=b", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Quick sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void quickNumberBlack100Test() {
        var args = new String[] {"a=q", "t=n", "c=b", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Quick sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void quickNumberBlack1000Test() {
        var args = new String[] {"a=q", "t=n", "c=b", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Quick sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void insertionNumberWhite100Test() {
        var args = new String[] {"a=i", "t=n", "c=w", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Insertion sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void insertionNumberWhite1000Test() {
        var args = new String[] {"a=i", "t=n", "c=w", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Insertion sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void bubbleCharWhite100Test() {
        var args = new String[] {"a=b", "t=c", "c=w", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Bubble sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void bubbleCharWhite1000Test() {
        var args = new String[] {"a=b", "t=c", "c=w", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Bubble sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Caracter]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Blancas]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_C, report.get(7), String.join("\n", report));
    }

    @Test
    void bubbleNumberBlack100Test() {
        var args = new String[] {"a=b", "t=n", "c=b", "r=16", "s=100"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Bubble sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }

    @Test
    void bubbleNumberBlack1000Test() {
        var args = new String[] {"a=b", "t=n", "c=b", "r=16", "s=1000"};
        var report = Chess.process(args);
        assertEquals("Ordenamiento: [Bubble sort]", report.get(0), String.join("\n", report));
        assertEquals("Tipo: [Numerico]", report.get(1), String.join("\n", report));
        assertEquals("Color: [Negras]", report.get(2), String.join("\n", report));
        System.out.println(report.get(3));
        assertEquals(ORD_N, report.get(7), String.join("\n", report));
    }
}
