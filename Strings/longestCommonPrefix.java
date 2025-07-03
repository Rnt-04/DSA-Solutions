import java.util.*;
public class longestCommonPrefix {
    public static void main (String [] args)
    {
        //
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter number of words");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("enter the words (space separated)");
        String s[]=sc.nextLine().split(" ");
        //
        String pref=s[0];
        int prefLen=pref.length();
        for (int i=1;i<s.length;i++){
            String str=s[i];
            while (prefLen>str.length() ||!pref.equals(str.substring(0,prefLen))){
                prefLen--;
                if (prefLen==0)
                {
                    pref="";
                    break;
                }
                pref=pref.substring(0,prefLen);
            }
        }
        System.out.println ("Longest common prefix: "+ pref);
    }
}
