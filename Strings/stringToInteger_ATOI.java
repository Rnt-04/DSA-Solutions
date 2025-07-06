/*
Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

1) Whitespace: Ignore any leading whitespace (" ").
2) Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
3) Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
4) Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.
5) Return the integer as the final result. 
*/
import java.util.*;
public class stringToInteger_ATOI 
{
    public static void main (String [] args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        sc.close();
        s.trim();
        long ans=0;
        int sign=1, i=0;
        if (s.charAt(i)=='-') {sign=-1; i++;}
        else if (s.charAt(i)=='+') i++;
        while (i<s.length()){
            char ch=s.charAt(i);
            if (ch<'0'||ch>'9') break; 
            ans=ans*10+(ch-'0'); //convert char to number
            if (sign*ans>Integer.MAX_VALUE) ans=Integer.MAX_VALUE;
            else if (sign*ans<Integer.MIN_VALUE) ans=Integer.MIN_VALUE;
            i++;
        }     
        System.out.println (sign*ans);
    }
}
