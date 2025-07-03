// Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array.
import java.util.*;
import java.math.*;
public class findMajorityElem {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array");
        int n=sc.nextInt();
        sc.nextLine();
        int arr[]=new int[n];
        int hash[]=new int [10000001];
        System.out.println ("Enter array elements (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
            hash[arr[i]]++;
        }
        //
        int elem=-1;
        // //better approach using hashing
        // int majority=n/2;
        // for (int i=0;i<n;i++){
        //     if (hash[arr[i]]>=majority){
        //         elem=arr[i];
        //     }
        // }
        // //
        //optimal approach (Moore's voting algorithm)  
        //assumes array always has a majority element
        int count=0;
        for (int i=0;i<n;i++){
            if (count==0){  
                count=1;
                elem=arr[i];
            } 
            else if (elem==arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        //display
        System.out.println ("Majority element is: "+elem);
    }
}
