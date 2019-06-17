package com;
class Robot{
    public void speak(String text){
        System.out.println(text);
    }
    public void jump(int height){
        System.out.println("Jumping "+height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving "+distance+" meters in "+direction);
    }


}
public class Parameter_Methodh {
    public static void main(){
        Robot sam = new Robot();
        sam.speak("Hey there! I am sam.");
        sam.jump(7);
        sam.move("Wwst",8);
        String greetings="Hello There!";
        sam.speak(greetings);
        int height=7;
        sam.jump(height);

    }
}
