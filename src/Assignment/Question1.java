package Assignment;
/*
 write program using Exception Handling with Method Overriding ?
 */

import java.io.*;

class Building{
    void color(){
        System.out.println("Blue");
    }
}
class Room extends Building{
    void color() throws IOException {
        System.out.println("Red");
    }
    public static void main(String[] args){
        Building obj = new Room();
        try{
            obj.color();

        }catch(Exception e){
            System.out.println(e);
        }
    }
}
public class Question1 {
}
