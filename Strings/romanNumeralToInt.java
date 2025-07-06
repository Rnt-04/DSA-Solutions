import java.util.*;
public class romanNumeralToInt {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter roman numeral");
        String s=sc.nextLine();
        sc.close();
        //
        //brute force
        s=s.toUpperCase(); //ensure all characters are capital
        s+="Z"; //extra character that adds no value to prevent index out of bounds in brute force
        int ans=0;
        for (int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='I')
            {
                if (s.charAt(i+1)=='V'){
                    ans+=4;
                    i++;
                }
                else if (s.charAt(i+1)=='X'){
                    ans+=9;
                    i++;
                }
                else ans+=1;
            }

            else if (s.charAt(i)=='V') ans+=5;

            else if (s.charAt(i)=='X')
            {
                if (s.charAt(i+1)=='L') 
                {
                    ans+=40;
                    i++;
                }
                else if (s.charAt(i+1)=='C') {
                    ans+=90;
                    i++;
                }
                else ans+=10;
            }

            else if (s.charAt(i)=='L') ans+=50;

            else if (s.charAt(i)=='C') {
                if (s.charAt(i+1)=='D') {
                    ans+=400;
                    i++;
                }
                else if (s.charAt(i+1)=='M') {
                    ans+=900;
                    i++;
                }
                else ans+=100;
            }

            else if (s.charAt(i)=='D') ans+=500;

            else if (s.charAt(i)=='M') ans+=1000;
        }
        System.out.println (ans);
    }
}
