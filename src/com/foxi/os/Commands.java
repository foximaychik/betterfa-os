package com.foxi.os;

import java.util.Scanner;

public class Commands {
    //Commands
    public static void help() {
        System.out.println("help - shows all commands");
        System.out.println("info - information about computer");
        System.out.println("color - choice new color of text");
    }
    public static void color() {
        Colors.col();
    }
    public static void info() {
        System.out.println(Colors.GREEN + "BetterFa OS V1.0");
        System.out.println("Processor: " + System.getenv("PROCESSOR_IDENTIFIER"));
        System.out.println("Processor Architecture" + System.getenv("PROCESSOR_ARCHITECTURE"));
        //System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
        System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors() + Colors.RESET);
    }
    public static void exit(int status) {
        System.exit(status);
    }
}
