package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static void inOut(Scanner in, PrintStream out) {

        while(in.hasNext()) {
            out.println(in.next());

        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        java.io.PrintStream out = System.out;

        inOut(in, out);
    }
}


