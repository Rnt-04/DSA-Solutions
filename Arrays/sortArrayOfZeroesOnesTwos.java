//Given an array consisting of only 0s, 1s, and 2s. 
//Write a program to in-place sort the array without using inbuilt sort functions. ( Expected: Single pass-O(N) and constant space)
import java.util.*;
public class sortArrayOfZeroesOnesTwos {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array");
        int n=sc.nextInt();
        sc.nextLine();
        int arr[]=new int [n];
        System.out.println("Enter array elements (0,1 and 2 only) (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        sc.close();
        //
        //sorting using 3 pointers
        int low=0;
        int mid=0;
        int high=arr.length-1;
        int temp;
        while (mid<=high){
            if (arr[mid]==0){
                temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                mid++;
                low++;
            }
            else if (arr[mid]==1){
                mid++;
            }
            else  // if arr[mid]==2 
            {
                temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        //
        //display
        for (int elem: arr){
            System.out.print (elem+" ");
        }
        //
    }
}
