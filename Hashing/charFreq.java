import java.util.*;
public class charFreq {
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);

        //input and precompute

        System.out.println ("Enter length of array");
        int n=sc.nextInt ();

        char arr[]=new char[n];
        int hash[]=new int[256];        

        System.out.println("Enter char array");

        for (int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
            hash[(arr[i])]++;    
        }

        //query
        char x='a';
        System.out.println("Enter characters to find frequency enter 0 to exit");
        while (x!='0'){
            x=sc.next().charAt(0);
            System.out.println (x+" occurs "+hash[(x)]+" times.");
        }
    }
}
