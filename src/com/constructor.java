package com;
class Machine{
    private String name;
    private int code;
    public Machine(){
        this("Annie",0);
        System.out.println("Constructor 1 running ");
        name = "Annie";
    }
    public Machine(String name){
        this(name,0);
        System.out.println("Constructor 2 running ");
        this.name=name;
    }
    public Machine(String name, int code){
        System.out.println("Constructor 3 running ");
        this.name=name;
        this.code=code;
    }

}
public class constructor {
    public static void main(String[] args){
        //Constructor 1 calling
        Machine machine1 = new Machine();
        //Constructor 2 calling
        Machine machine2 = new Machine("Hello");
        //Constructor 3 calling
        Machine machine3 = new Machine(" XYZ", 2);
    }
}
