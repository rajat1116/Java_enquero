package com;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExpHand {
    public static void main(String[] args){
        File file = new File("com/Test.txt");


        try{
            FileReader fr = new FileReader(file);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
