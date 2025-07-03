import java.util.*;
public class FreqHash {
    public static void main (String args[])
    {
        //input and precompute
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter array length");
        int n=sc.nextInt();
        int arr[]=new int [n];
        int hash[]=new int [100001];
        for (int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            hash[arr[i]]++;
        }
        //query
        int x=0;
        System.out.println ("Enter queries to search frequency, enter -1 to exit");
        while (x!=-1)
        {
            x=sc.nextInt();
            System.out.println (x+ " occurs: "+hash[x]+" times.");
        }
    }
}
