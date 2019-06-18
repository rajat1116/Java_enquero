package Assignment.Abstraction;

public class Camera extends Machine{
    public void start(){
        System.out.println("Camera starting ");
    }
    public void doStuff(){
        System.out.println("Camera doing its stuff ");
    }
    public void shutDown(){
        System.out.println("Camera shutting down ");
    }
}
