package com;

public class StringBuilderClass {
    public static void main(String[] args){
        /*Inefficient method
        because in this process we actually create new string ever time which turn
        out to be a very inefficient.
         */
        String info = " ";
        info += "My name is Bob. ";
        info += " ";
        info += "I am a builder.";

        /*
        This process makes easy by String builder class
        syntax : StringBuilder variable_name = new SringBuilder();
        we can pass the argument in the parenthesis
        To print System.out.println(variable_name.toString())
         */
        StringBuilder sb = new StringBuilder();
        sb.append("My name is RDJ");
        sb.append(" ");
        sb.append("and I am Iron man");
        System.out.println(sb.toString());

        /*
        Can also format in this way.
         */

        StringBuilder s = new StringBuilder();
        sb.append("I am Bruce Wayne")
                .append(" ")
                .append("and I am Batman");

        System.out.println(s.toString());


    }
}
