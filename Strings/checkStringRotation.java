import java.util.*;
public class checkStringRotation {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first string");
        String s=sc.nextLine();
        System.out.println("Enter the goal string");
        String g=sc.nextLine();
        sc.close();
        //
        //using hashmap
        if (s.length()!=g.length()) System.out.println("Not a rotation");
        else if ((s+g).contains(g)){
            System.out.println ("The goal is a rotation of the given string");
        }
        else System.out.println("Not a rotation");
    }
}
