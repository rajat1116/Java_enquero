package com;

import java.util.Scanner;

class Per{
    String name;
    int age;
    void sayHello(){
        System.out.println("Hello!");
    }
    void speak(){
        System.out.println("The name you input is "+ name + " and age "+ age);
    }
}

public class ClassMethod {
    public static void main(String[] args){
        Per person1=new Per();

        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);

        System.out.println("Enter name: ");
        String name1=input1.nextLine();
        System.out.println("Enter age: ");
        int age1=input2.nextInt();

        person1.name=name1;
        person1.age=age1;
        person1.sayHello();
        person1.speak();

    }
}
