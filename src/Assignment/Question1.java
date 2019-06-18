package Assignment;
/*
 write program using Exception Handling with Method Overriding ?
 */

import java.io.*;

class Question1{
    void color(){
        System.out.println("Blue");
    }
}
class Room extends Question1{
    void color() throws IOException {
        System.out.println("Red");
    }
    public static void main(String[] args){
        Question1 obj = new Room();
        try{
            obj.color();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
