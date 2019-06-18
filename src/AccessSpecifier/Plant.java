package AccessSpecifier;

public class Plant {
    //Bad practice
    public String name;
    private String type;
    protected String size;
    int height; //
    //can't change it later with any number
    public final static int ID =7;
    public Plant(){
        this.name = "Sunflower";
        System.out.println("");
        this.type="plant";
        this.size="large";
        this.height=7;
    }

}
