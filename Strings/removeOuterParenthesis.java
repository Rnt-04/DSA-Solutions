// Input: s = "(()())(())"
// Output: "()()()"
// Explanation:  The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
// After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
import java.util.*;
public class removeOuterParenthesis {
    public static void main (String args []){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter the string ");
        String s=sc.nextLine();
        //
        //
        int count=0;
        StringBuilder str=new StringBuilder("");
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch==')') count--;
            if (count!=0) str.append(ch);
            if (ch=='(') count++;
        }
        //display 
        System.out.println (str);
    }
}

