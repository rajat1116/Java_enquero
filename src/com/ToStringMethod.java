package com;
class XYZ{
    private String name;
    private int id;
    public XYZ(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        //Retrun using string format
        return String.format("%-4d: %s", id, name);

        /*
        return id + ":" +name is inefficient so we prefer other methods
         */
        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        return sb.toString();
        */

    }
}
public class ToStringMethod {
    public static void main(String[] args){
        XYZ p1 = new XYZ(7,"killmonger");
        XYZ p2 = new XYZ(5,"t'challa");

        System.out.println(p1);
        System.out.println(p2);

    }
}
