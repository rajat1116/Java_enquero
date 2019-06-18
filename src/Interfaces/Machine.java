package Interfaces;

public class Machine implements Info{
    private int id = 7;
    public void start(){
        System.out.println("Machine Starts.");

    }
    public void showInfo(){
        System.out.println("Machine id : "+id);
    }
}
