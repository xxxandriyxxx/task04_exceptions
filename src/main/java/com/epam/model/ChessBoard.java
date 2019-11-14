package com.epam.model;

public class ChessBoard extends Figure {

    public ChessBoard(int size) {
        super(size);
    }

    public void print() {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0)
                        System.out.print("* ");
                    else
                        System.out.print("- ");
                } else {
                    if (j % 2 != 0)
                        System.out.print("* ");
                    else
                        System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

}
