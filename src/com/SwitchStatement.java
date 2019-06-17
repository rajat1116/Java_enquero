package com;

import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String text = input.nextLine();

        switch (text) {
            case "start":
                System.out.println("Machine Start!");
                break;
            case "stop":
                System.out.println("Machine Stop");
                break;
            default:
                System.out.println("Command not recognized");

        }

    }
}

