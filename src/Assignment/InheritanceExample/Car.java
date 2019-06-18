package Assignment.InheritanceExample;

public class Car extends machine{
    /*
    Method overriding
    taking start function from machine
     */
    public void start(){
        System.out.println("Car Start");
    }
    public void wipeWindSheild(){
        System.out.println("Wiping Wind Sheild.");
    }

}
