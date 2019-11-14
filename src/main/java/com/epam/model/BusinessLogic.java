package com.epam.model;

public class BusinessLogic implements Model {

    private Square square;
    private Triangle triangle;
    private ChessBoard chessBoard;

    public BusinessLogic(int size) {
        square = new Square(size);
        triangle = new Triangle(size);
        chessBoard = new ChessBoard(size);
    }

    public void printSquare() {
        square.print();
    }

    public void printSquareWithDiagonal1() {
        square.printWithDiagonal1();
    }

    public void printSquareWithDiagonal2() {
        square.printWithDiagonal2();
    }

    public void printTriangle1() {
        triangle.print1();
    }

    public void printTriangle2() {
        triangle.print2();
    }

    public void printTriangle3() {
        triangle.print3();
    }

    public void printTriangle4() {
        triangle.print4();
    }

    public void printChessBoard() {
        chessBoard.print();
    }

}
