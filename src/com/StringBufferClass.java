package com;

public class StringBufferClass {
    public static void main(String[] args){
        StringBuffer s = new StringBuffer();
        s.append("Hello");
        int p = s.length();
        int q = s.capacity();
        System.out.println("Length is "+p);
        System.out.println("Capacity is "+q);

    }
}
