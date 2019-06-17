package com;

import java.util.Scanner;

class Person{
    String name;
    int age;
}
public class Classobj {
    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person();

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter 1st person name: ");
        String name1 = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter 1st person age: ");
        int age1 = input2.nextInt();

        person1.name=name1;
        person1.age=age1;

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter 2nd person name: ");
        String name2 = input3.nextLine();

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter 2nd person age: ");
        int age2 = input4.nextInt();

        person2.name = name2;
        person2.age = age2;

        System.out.println("Person1's name is " + person1.name + " age is "+ person1.age);
        System.out.println("Person2's name is " + person2.name + " age is "+ person2.age);

    }
}
