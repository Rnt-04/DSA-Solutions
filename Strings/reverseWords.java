import java.util.*;
public class reverseWords {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s[]=sc.nextLine().split(" ");
        String revS="";
        for (int i=s.length-1;i>=0;i--){
            revS+=s[i]+" ";
        }
        //display
        System.out.println(revS);
    }
}
