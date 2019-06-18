package Assignment.Abstraction;

public class car  extends Machine{
    public void start(){
        System.out.println("Starting engine");
    }
    public void doStuff(){
        System.out.println("Driving car ");
    }
    public void shutDown(){
        System.out.println("Engine off");
    }

}
