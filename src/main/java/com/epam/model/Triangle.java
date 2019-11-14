package com.epam.model;

public class Triangle extends Figure {

    public Triangle(int size) {
        super(size);
    }

    public void print1() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i >= j) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void print2() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i <= j) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void print3() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j < i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public void print4() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j <= size - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

}
