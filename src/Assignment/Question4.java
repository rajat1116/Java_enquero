package Assignment;

import java.util.Scanner;
public static int countChar(String str, char ch){
    int count=0;
    while (str.indexOf(ch)!=-1){
        count++;
        str=str.substring((str.indexOf(ch))+1);

    }
    return count;
}
public static void fetchLetters(String str){
    str=str.replace(" ","");
    while(str.length()>0){
        char ch=str.charAt(0);
        System.out.println(ch+" "+countChar(str,ch));
        str=str.replace(""+ch,"");

    }

}
public class Question4 {
    Scanner input1 = new Scanner(System.in);
    String str = input1.nextLine();
    fetchLetters(str);


}
