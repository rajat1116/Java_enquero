package AccessSpecifier;

public class Main {
    public static void main(String[] args){
        Plant plant = new Plant();
        System.out.println(plant.name); //because it's set to public
        System.out.println(plant.ID);

        //System.out.println(plant.type); wont work because it's private

        /*
        if any protected variable isn't in the same package.
        It cannot be access.
         */
        System.out.println(plant.height);
    }
}
