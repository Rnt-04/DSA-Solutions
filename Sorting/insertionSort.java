//takes an element and places it in its correct position

import java.util.*;
public class insertionSort {
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);

        //input 
        System.out.println ("Enter size of array: ");
        int n=sc.nextInt();
        sc.nextLine();
        int arr[]=new int[n];
        System.out.println ("Enter array values (space separated): ");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }

        //sorting
        int temp;
        for (int i=0;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
            }

        //output
        for (int elem: arr){
            System.out.print (elem+" ");
        }

    }
}