package com.epam.controller;

import com.epam.model.BusinessLogic;
import com.epam.model.Model;

public class ControllerImpl implements Controller {

    private Model model;

    public ControllerImpl(int size) {
        model = new BusinessLogic(size);
    }

    @Override
    public void printSquare() {
        model.printSquare();
    }

    @Override
    public void printSquareWithDiagonal1() {
        model.printSquareWithDiagonal1();
    }

    @Override
    public void printSquareWithDiagonal2() {
        model.printSquareWithDiagonal2();
    }

    @Override
    public void printTriangle1() {
        model.printTriangle1();
    }

    @Override
    public void printTriangle2() {
        model.printTriangle2();
    }

    @Override
    public void printTriangle3() {
        model.printTriangle3();
    }

    @Override
    public void printTriangle4() {
        model.printTriangle4();
    }

    @Override
    public void printChessBoard() {
        model.printChessBoard();
    }

}
