//pushes maximum to the end by adjacent swapping

import java.util.*;
public class bubbleSort {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        //input
        System.out.println ("Enter size of array: ");
        
        int n=sc.nextInt();
        sc.nextLine();
        int arr[] = new int [n];
        System.out.println ("Enter the array elements (space separated)");
        String s[]=sc.nextLine().split(" ");

        for (int i=0;i<s.length;i++){
            arr[i]=Integer.parseInt(s[i]);
        }

        //sorting
        int temp;
        for (int i=arr.length;i>0;i--)
        {
            for (int j=0;j<i-1;j++)
            {
                if (arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        //print
        for (int elem: arr){
            System.out.print(elem+" ");
        }
    }
}