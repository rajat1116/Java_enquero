package Polymorphism;

public class Main {
    public static void main (String[] args){
        Plant plant = new Plant();
        Tree tree = new Tree();

        Plant plant2 = tree;
        plant2.grow();
        tree.shedLeaf();

        //plant2.shedLeaf(); this wont work

        doGrow(tree);
    }
    public static void doGrow(Plant plant){
        plant.grow();
    }
}
