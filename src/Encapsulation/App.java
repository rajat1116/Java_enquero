package Encapsulation;
class Plant{
    //usually only static final members are public
    public static final int ID=7;

    //Instance variable should be declare private or at least protected
    private String name;
    // Only methods intended for use outside the class
    // should be public. These methods should be documented
    // carefully if you distribute your code.
    public String getData() {
        String data = "Some stuff "+ calculateGrowthForecast();
        return data;
    }
    private int calculateGrowthForecast() {
        return 9;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class App {
    public static void main(String args[]){

    }


}
