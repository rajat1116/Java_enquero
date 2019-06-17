package com;

import java.util.Scanner;

public class UserIn {
    public static void main(String[] args){
        //creating a scanner object
        Scanner input1 = new Scanner(System.in);
        //output the promte
        System.out.println("Enter a integer: ");
        //get the user input
        int value=input1.nextInt();
        //throw the output
        System.out.println("The value you input is: " + value);

        Scanner input2=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String Text=input2.nextLine();
        System.out.println("The String you input: " + Text);

        Scanner input3=new Scanner(System.in);
        System.out.println("Enter a Floating: ");
        double F=input3.nextDouble();
        System.out.println("The double you input "+ F);

    }

}
