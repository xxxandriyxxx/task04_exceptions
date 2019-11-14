package com.epam.model;

public class Square extends Figure {

    public Square(int size) {
        super(size);
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i != 1 && i != size && j != 1 && j != size) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void printWithDiagonal1() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i != 1 && i != size && j != 1 && j != size && j != i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void printWithDiagonal2() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i != 1 && i != size && j != 1 && j != size && j != size + 1 - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
