package com.epam.view;

import com.epam.controller.Controller;
import com.epam.controller.ControllerImpl;

import java.util.Arrays;
import java.util.Scanner;

public class View {

    private Controller controller;

    public View() {
        controller = new ControllerImpl();
    }

    public void show() {
        Scanner scan = new Scanner(System.in);

        String str;
        int firstNum;
        int lastNum;
        int[] array;
        long[] fibonacciArray;

        while (true) {
            System.out.println("================ TASK 2 =================\n"
                    + "'q' for exit\n"
                    + "-----------------------------------------\n"
                    + "Input the first number:");
            str = scan.nextLine();
            if (str.equals("q")) {
                System.out.println("Goodbye !!!");
                break;
            } else {
                firstNum = Integer.parseInt(str);
                System.out.println("Input the last number:");
                str = scan.nextLine();
                lastNum = Integer.parseInt(str);
                array = createArray(firstNum, lastNum);
                System.out.println("-----------------------------------------");
                System.out.println("The interval [" + firstNum + ";" + lastNum
                        + "] includes the next numbers:");
                System.out.println(Arrays.toString(array));
                System.out.println("Odd numbers:");
                SortArray.printOdd(array);
                System.out.println("\nEven numbers by reverse:");
                SortArray.printEvenReverse(array);
                System.out.println("\nThe sum of odd numbers:");
                SortArray.printSumOdd(array);
                System.out.println("The sum of even numbers:");
                SortArray.printSumEven(array);
                System.out.println("-----------------------------------------");
                System.out.println("Input the size of Fibonacci sequence:");
                str = scan.nextLine();
                fibonacciArray = Fibonacci.getSequence(Integer.parseInt(str));
                System.out.println("Fibonacci sequence:");
                System.out.println(Arrays.toString(fibonacciArray));
                System.out.println("The biggest odd number:");
                System.out.println(Fibonacci.getBiggestOdd(fibonacciArray));
                System.out.println("The biggest even number:");
                System.out.println(Fibonacci.getBiggestEven(fibonacciArray));
                System.out.println("Percentage of odd numbers:");
                System.out.println(Fibonacci.getPercentageOdd(fibonacciArray));
                System.out.println("Percentage of even numbers:");
                System.out.println(Fibonacci.getPercentageEven(fibonacciArray));
            }
        }
    }
}
