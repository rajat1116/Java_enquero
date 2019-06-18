package Assignment;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args){
        int r, s=0, t;
        Scanner input1 = new Scanner(System.in);
        int n = input1.nextInt();
        t=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(t == s){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
