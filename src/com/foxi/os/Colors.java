package com.foxi.os;

import java.util.Scanner;

public class Colors {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";

    public static void col() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write color");
        String col = sc.nextLine();

        if (col.equals("-red"))
            System.out.println(RED + "Success!");
        if (col.equals("-green"))
            System.out.println(GREEN + "Success!");
        if (col.equals("-blue"))
            System.out.println(BLUE + "Success!");
        if (col.equals("-reset"))
            System.out.println(RESET + "Success!");
    }
}
