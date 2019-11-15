package com.epam.view;

import com.epam.controller.Controller;
import com.epam.controller.ControllerImpl;

import java.util.Scanner;

public class View {

    public void show() {
        Controller controller;
        Scanner scan = new Scanner(System.in);
        int figureSize;
        String keyMenu;

        System.out.println("================ FIGURE =================\n"
                + "Enter a figure size");
        figureSize = Integer.parseInt(scan.nextLine());
        controller = new ControllerImpl(figureSize);
        while (true) {
            System.out.println("=========== select a figure =============\n"
                    + "'q' for exit\n"
                    + "-----------------------------------------\n"
                    + "1 - Square\n"
                    + "2 - Square with diagonal 1\n"
                    + "3 - Square with diagonal 2\n"
                    + "4 - Triangle 1\n"
                    + "5 - Triangle 2\n"
                    + "6 - Triangle 3\n"
                    + "7 - Triangle 4\n"
                    + "8 - Chess board\n");
            keyMenu = scan.nextLine();
            if (keyMenu.equals("q")) {
                System.out.println("Goodbye !!!");
                break;
            } else {
                switch (Integer.parseInt(keyMenu)) {
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
                        System.out.println("Wrong symbol!");
                        break;
                }
            }
        }
    }

}
