package com;

import java.util.Scanner;

class Frog{
    String name;
    int age;
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age=newAge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}

public class Setters {
    public static void main(String[] args){
        Frog frog1 = new Frog();
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Name: ");
        String name1=input1.nextLine();
        System.out.println("Age: ");
        int age1=input2.nextInt();

        /*This is accessing a instance
         * variable with direct method
         * It's only possible when the
         * instance variable is public
         */
        System.out.println("From direct instance: ");
        frog1.name=name1;
        frog1.age=age1;
        System.out.println(frog1.name);
        System.out.println(frog1.age);

        System.out.println("From setMethod: ");
        frog1.setName(name1);
        frog1.setAge(age1);
        System.out.print("Output from getName: "+frog1.getName());
        System.out.println();
        System.out.print("Output from getAge: "+frog1.getAge());

    }
}
