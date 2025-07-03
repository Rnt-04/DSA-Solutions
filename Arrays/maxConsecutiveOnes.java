//given an array of 1s and 0s, find the maximum consecutive 1s in the array
import java.util.*;
public class maxConsecutiveOnes {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        sc.nextLine();
        System.out.println ("Enter array elements (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        //
        //find max consecutive 1s
        int max=0;
        int c=0;
        for (int i=0;i<n;i++){
            if (arr[i]==1){
                c++;
                if (c>max){
                    max=c;
                }
            }
            else{
                c=0;
            }
        }
        //display
        System.out.println("Max number of consecutive ones is: "+max);
    }
}
