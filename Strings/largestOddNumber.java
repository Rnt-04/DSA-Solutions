// You are given a string num, representing a large integer. 
// Return the largest-valued odd integer (as a string) that is a non-empty substring of num.
// Return an empty string "" if no odd integer exists.
import java.util.*;
public class largestOddNumber {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a string representing a large integer");
        String s=sc.nextLine();
        //
        // //brute force approach
        // int sub;
        // String max="0";
        // for (int i=0;i<s.length();i++){
        //     for (int j=i;j<s.length();j++){
        //         sub=Integer.parseInt(s.substring(i, j+1));
        //         if (sub % 2 != 0 && sub > Integer.parseInt(max)) max = Integer.toString(sub);
        //     }
        // }
        // if (max!="0") System.out.println (max);
        // //

        // optimized approach (same logic but using single loop)
        int sub;
        String max="0";
        for (int i=s.length()-1;i>0;i--){
            sub=Integer.parseInt(s.substring(0, i));
            if (sub%2!=0 && sub>Integer.parseInt(max)) max=Integer.toString (sub);
        }
        if (max!="0") System.out.println (max);
        //
    }
}