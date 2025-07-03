//check if a given array is sorted or not

import java.util.*;
class checkIfSorted
{
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
        boolean sorted=true;
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1])  //assuming we are checking for ascending order
            {
                sorted=false;
                break;
            }
        }
        System.out.println (sorted);
    }
}