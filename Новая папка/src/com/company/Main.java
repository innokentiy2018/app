package com.company;

import SIAOD_Golovin.SIAOD1;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    private static void inOut(Scanner in,PrintStream out )
    {
        while(in.hasNext())
        {
            out.println(in.next());

        }
    }

    private static void SIAOD1(Scanner in, PrintStream out) {

        SIAOD1 stack = new SIAOD1();
        while(in.hasNext()) {
            String s = in.next();
            if ((s.equals("-"))) {
                out.print(stack.pop() + " ");
            } else {
                stack.push(s);
            }
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        PrintStream out = System.out;
        inOut(in,out);
    }
}
