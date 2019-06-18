package AccessSpecifier;

public class Feild {
    private Plant plant = new Plant();
    public Feild(){
        //size is protected and Feild is the same package as Plant
        System.out.println(plant.size);
    }
}
