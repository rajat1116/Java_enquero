package com;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
		/*
		System.out.println("Enter a number: ");
		int value=input.nextInt();
		while(value!=5){
			System.out.println("Enter a number: ");
			value=input.nextInt();
		}
		*/
        int value = 0;
        do {
            System.out.println("Enter a number: ");
            value = input.nextInt();

        } while (value != 5);
        System.out.println("Got 5!");
    }
}

