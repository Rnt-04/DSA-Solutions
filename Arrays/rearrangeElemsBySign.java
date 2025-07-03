//There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. 
//Without altering the relative order of positive and negative elements, you must return an array of alternately positive and negative values.
//array must start with positive
import java.util.*;
public class rearrangeElemsBySign {    
    public static void main (String [] args){
        //input
        Scanner sc= new Scanner (System.in);
        System.out.println ("Enter size of array");
        int n=sc.nextInt();
        sc.nextLine();
        int arr[]=new int [n];
        System.out.println ("Enter array elements (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        sc.close();
        //
        // // brute force approach
        // int x=0; //iterator
        // int y=0; //iterator
        // int pos[]=new int[n/2]; //array to store positives
        // int neg[]=new int [n/2]; //array to store negatives
        // for (int i=0;i<n;i++){
        //     if (arr[i]<0){
        //         neg[x]=arr[i];
        //         x++;
        //     }
        //     else{
        //         pos[y]=arr[i];
        //         y++;
        //     }
        // }
        // //put positives at even positions, negatives at odd positions 
        // for (int i=0;i<n/2;i++){
        //     arr[2*i]=pos[i];
        //     arr[2*i+1]=neg[i];
        // }
        // //
        //optimal
        int pos=0;
        int neg=1;
        int ans[]=new int [n];
        for (int i=0;i<n;i++){
            if (arr[i]<0){
                ans[neg]=arr[i];
                neg+=2;
            }
            else{
                ans[pos]=arr[i];
                pos+=2;
            }
        }
        //
        
        //display
        System.out.println ("Sorted array: ");
        for (int elem:ans){
            System.out.print (elem+" ");
        }
        //
    }
}

