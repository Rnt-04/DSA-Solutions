import java.util.*;
class maxNestingDepthOfParanthesis{
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a string with paranthesis");
        String s=sc.nextLine();
        sc.close();
        //
        //using counter
        int c=0;
        int max=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='(') c++;
            if (s.charAt(i)==')') c--;
            if (c>max) max=c;
        }
        System.out.println ("Maximum nesting depth of paranthesis is: "+max);
    }
}