package Assignment;

import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args){

        ArrayList<Integer> A = new ArrayList<>();
        for(int i=2;i<=100;i++){
            int count=0;
            for(int k=2;k<=i;k++){
                if(i%k == 0){
                    count++;
                }
            }
            if(count<2){
                A.add(i);
            }

        }
        System.out.println(A);
    }
}
