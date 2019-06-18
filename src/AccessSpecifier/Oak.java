package AccessSpecifier;

public class Oak extends Plant {
    public Oak(){
        /*
        Won't work because it's private
         */
        //type="tree";


        //this will work because sie is protected, Oak is subclass of plant
        this.size="large";
        //no access specifier
        this.height=10;
    }
}
