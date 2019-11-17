package com.epam.view;

import com.epam.controller.Controller;
import com.epam.controller.ControllerImpl;
import com.epam.model.MyNumberFormatException;

import java.util.Scanner;

public class View {

    public void show() throws MyNumberFormatException {
        Controller controller;
        Scanner scan = new Scanner(System.in);
        int figureSize;
        String keyMenuStr;
        try {
            System.out.println("================ FIGURE =================\n"
                    + "Enter a figure size");
            figureSize = Integer.parseInt(scan.nextLine());
            controller = new ControllerImpl(figureSize);
            while (true) {
                System.out.println("=========== select a figure =============\n"
                        + "'q' for exit\n"
                        + "'i' to get an instruction\n"
                        + "-----------------------------------------\n"
                        + "1 - Square\n"
                        + "2 - Square with diagonal 1\n"
                        + "3 - Square with diagonal 2\n"
                        + "4 - Triangle 1\n"
                        + "5 - Triangle 2\n"
                        + "6 - Triangle 3\n"
                        + "7 - Triangle 4\n"
                        + "8 - Chess board\n"
                        + "-----------------------------------------");
                keyMenuStr = scan.nextLine();
                if (keyMenuStr.equals("q")) {
                    System.out.println("Goodbye !!!");
                    break;
                } else if (keyMenuStr.equals("i")) {
                    controller.printInstruction();
                } else {
                    printFigure(keyMenuStr, controller);
                }
            }
        } catch (NumberFormatException e) {
            throw new MyNumberFormatException("Entered an inadmissible symbol!!!");
        }
    }

    private void printFigure(String keyMenuStr, Controller controller) throws MyNumberFormatException {
        try {
            int keyMenuInt = Integer.parseInt(keyMenuStr);
            switch (keyMenuInt) {
                case 1:
                    controller.printSquare();
                    break;
                case 2:
                    controller.printSquareWithDiagonal1();
                    break;
                case 3:
                    controller.printSquareWithDiagonal2();
                    break;
                case 4:
                    controller.printTriangle1();
                    break;
                case 5:
                    controller.printTriangle2();
                    break;
                case 6:
                    controller.printTriangle3();
                    break;
                case 7:
                    controller.printTriangle4();
                    break;
                case 8:
                    controller.printChessBoard();
                    break;
                default:
                    System.out.println("Please, enter a correct key!");
                    break;
            }
        } catch (NumberFormatException e) {
            throw new MyNumberFormatException("Entered an inadmissible symbol!!!");
        }
    }

}
