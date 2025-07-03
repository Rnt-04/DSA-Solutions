//given an array of elements where all except one element appears twice, find the element that appears once
import java.util.*;
public class elemThatAppearsOnce {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array (odd)");
        int n=sc.nextInt();
        int arr[]=new int[n];
        sc.nextLine();
        System.out.println ("Enter array elements where all elements appear twice except for one (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        //
        //find the solitary element using XOR. XOR of all elements in the array will result in the solitary element. 
        //for example if the array is 4,1,2,1,2 the XOR of all elements 4^1^2^1^2 will result in 4.
        int x=0;
        for (int i=0;i<n;i++){
            x=x^arr[i];
        }

        // //brute force approach (checking count of each element)
        // int count=0,x=0;
        // for (int i=0;i<n;i++){
        //     count=0;
        //     for (int j=0;j<n;j++){
        //         if (arr[i]==arr[j]){
        //             count++;
        //         }
        //     }
        //     if (count==1){
        //         x=arr[i];
        //         break;
        //     }
        // }
        // //

        //display
        System.out.println ("The element that appears once is: "+x);
    }
}

