package com;
public class MultiDArray {
    public static void main(String[] args){
        int[] value={2,3,4}; //one-D array
        System.out.println(value[1]);
        int[][] grid={
                {3,4,5},
                {4,5},
                {1,2,3,4}
        };
        System.out.println(grid[1][1]);
        System.out.println(grid[0][2]);

        //creating an array with out initialization
        String[][] text=new String[2][3];
        text[0][1]="Hello There";
        System.out.println(text[0][1]);

        for(int row=0; row<grid.length; row++){
            for(int col=0; col<grid[row].length; col++){
                System.out.print(grid[row][col]+ "\t");
            }
            System.out.println();
        }

        String[][] words=new String[2][];
        System.out.println(words[0]);
        words[0]=new String[3];
        words[0][1]="hi there";
        System.out.println(words[0][1]);

    }
}
