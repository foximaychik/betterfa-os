package com.foxi.os;

import java.math.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        final String name = "BetterFa OS";
        final String version = "V0.1";

        System.out.println(name + " " + version);
        System.out.println("Write help to show all commands");
        Scanner sc = new Scanner(System.in);

        while(true) {
            String command = sc.nextLine();

            if(command.equals("help")) {
                Commands.help();
            }
            else if (command.equals("color")) {
              Commands.color();

            }
            else if (command.equals("info")) {
                Commands.info();
            }
            else if (command.equals("exit")) {
                Commands.exit(123);
            }
            else {
                System.out.println(Colors.RED + command + ": Unknown command!" + Colors.RESET);
            }
        }
    }
}
