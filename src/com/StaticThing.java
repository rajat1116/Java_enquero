package com;
class Thing{
    /* final helps to create a constant just like MATH.PI function
     */
    public final static int LUCKY_NUMBER=7;
    public static String description;
    public String name;
    public static int count = 0;
    public int id;
    public Thing(){
        count++;
    }
    public void showName(){
        System.out.println("Object id "+id+","+description+" : "+name);
    }
    public static void showInfo(){
        System.out.println(description);
    }

}

public class StaticThing {
    public static void main(String[] args){
        Thing.description = "I am Thing";
        Thing.showInfo();
        System.out.println("Before creating an object, count is: "+Thing.count);
        Thing thing1= new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating object, count is "+Thing.count);
        thing1.name="rajat";
        thing2.name="rahul";
        thing1.showName();
        thing2.showName();
        System.out.println(Math.PI);
        System.out.println(Thing.LUCKY_NUMBER);
    }
}
