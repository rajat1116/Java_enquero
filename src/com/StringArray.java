package com;

public class StringArray {
    public static void main(String[] args){
        String[] words = new String[3];

        // Set the array elements (point the references
        // at strings)
        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        // Access an array element and print it.
        System.out.println(words[0] +" "+  words[1] +" "+ words[2]);

        // Simultaneously declare and initialize an array of strings
        String[] fruits = {"apple", "banana", "pear", "kiwi"};

        // Iterate through an array
        /*for(String fruit: fruits) {
            System.out.println(fruit);

             // this doesn't work
        */
        for(int i=0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        int value=0;
        String text=null;
        System.out.println(text);
        String[] texts=new String[2];
        System.out.println(texts[0]);
        texts[0]="zero";
    }
}

