package Assignment.InheritanceExample;


public class APP {
    public static void main(String[] args){
        machine mach1 = new machine();
        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        car1.start();
        car1.wipeWindSheild();
        car1.stop();
    }
}
