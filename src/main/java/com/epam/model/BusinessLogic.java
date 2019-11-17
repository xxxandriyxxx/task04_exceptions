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

    @Override
    public void printSquare() {
        square.print();
    }

    @Override
    public void printSquareWithDiagonal1() {
        square.printWithDiagonal1();
    }

    @Override
    public void printSquareWithDiagonal2() {
        square.printWithDiagonal2();
    }

    @Override
    public void printTriangle1() {
        triangle.print1();
    }

    @Override
    public void printTriangle2() {
        triangle.print2();
    }

    @Override
    public void printTriangle3() {
        triangle.print3();
    }

    @Override
    public void printTriangle4() {
        triangle.print4();
    }

    @Override
    public void printChessBoard() {
        chessBoard.print();
    }

    @Override
    public void printInstruction() {
        try (Instruction instruction = new Instruction()) {
            instruction.printInstruction();
        }
    }

}
