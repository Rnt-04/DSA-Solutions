import java.util.*;
public class maxSubArraySum_kadanesAlgo {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array");
        int n=sc.nextInt();
        sc.nextLine();
        int arr[]=new int [n];
        System.out.println("Enter array elements (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        sc.close();
        //

        long max=Long.MIN_VALUE; // to store maximum sum value

        //finding maximum subarray sum with kadanes algo
        long sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (sum>max){
                max=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        //

        //display
        System.out.println ("Maximum subarray sum= "+max);
        //
    }
}