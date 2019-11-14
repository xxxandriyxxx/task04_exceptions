package com.epam;

import com.epam.model.ChessBoard;
import com.epam.model.Square;
import com.epam.model.Triangle;

public class Application {

    public static void main(String[] args) {

        Square sss = new Square(10);
        sss.print();
        sss.printWithDiagonal1();
        sss.printWithDiagonal2();

        Triangle ttt = new Triangle(10);
        ttt.print1();
        ttt.print2();
        ttt.print3();
        ttt.print4();

        ChessBoard ccc = new ChessBoard(20);
        ccc.print();


        
    }
}
