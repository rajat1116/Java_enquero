package Assignment;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = input1.nextLine();
        int count=1;
        for(int i=0;i< str1.length();i++){
            if((str1.charAt(i) == ' ') && (str1.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("Word: "+count);

    }
}
