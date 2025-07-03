import java.util.*;
public class secondSmallestElem {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array ");
        int n=sc.nextInt ();
        int arr[]=new int [n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //
        int small=Integer.MAX_VALUE;
        int second_small=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]<small){
                second_small=small;
                small=arr[i];
            }
            else if (arr[i]<second_small){
                second_small=arr[i];
            }
        }

        //output
        System.out.println ("Second smallest element element: "+second_small);
    }
}
