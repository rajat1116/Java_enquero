package InheritanceExample;
/*
using for inheritance
 */

public class machine {
    // Can only access here itself not in car unless the private is removed
    private String name= "Machine Type 1";
    public void start(){
        System.out.println("Machine Start");
    }

    public void stop(){
        System.out.println("Machine Stop");
    }
}
