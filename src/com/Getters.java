package com;
import java.util.Scanner;
class GettersPerson{
    String name;
    int age;
    int calculateRetirement(){
        int leftYear=65-age;
        return leftYear;
    }
    int getAge(){
        return age;
    }
    String getName(){
        return name;
    }

}
public class Getters {
    public static void main(){
        GettersPerson person1 = new GettersPerson();

        Scanner input1=new Scanner(System.in);
        Scanner input2=new Scanner(System.in);
        System.out.println("Enter name:");
        String name1=input1.nextLine();
        System.out.println("Enter age: ");
        int age1=input2.nextInt();
        int years=person1.calculateRetirement();
        System.out.println("Years left " +years);

        person1.name=name1;
        person1.age=age1;

        int age2=person1.getAge();
        String name2 = person1.getName();

        System.out.println("Name " + name2);
        System.out.println("Age "+ age2);
    }
}
