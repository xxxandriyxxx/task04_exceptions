package com.epam.model;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

public class Instruction implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Close method works!!!");
    }

    public void printInstruction() {
        File file = new File("D:\\instruction.txt");
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
