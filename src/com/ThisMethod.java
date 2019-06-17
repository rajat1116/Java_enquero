package com;

import java.util.Scanner;

class Human{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
public class ThisMethod {
    public static void main(String[] args){
        Human person1 = new Human();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Name:  ");
        String name1 = input1.nextLine();
        System.out.println("Age: ");
        int age1 = input2.nextInt();

        person1.setName(name1);
        person1.setAge(age1);

        System.out.println("Name: " + person1.getName());
        System.out.println("Age: "+ person1.getAge());
    }
}
