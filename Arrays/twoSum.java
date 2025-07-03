//given an array of integers and a target sum, find two distinct elements such that their sum matches the target (Return yes if such numbers exists). 
//Also find their indices
import java.util.*;
public class twoSum {
    public static void main (String[] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array ");
        int n=sc.nextInt ();
        int arr[]=new int [n];
        HashMap <Integer, Integer> map= new HashMap<>();  //used in hashing approach only
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        map.put (arr[i],i); //for hasing approach
        }
        System.out.println ("Enter target sum ");
        int t=sc.nextInt();
        //

        int ind[]=new int [2]; //array to store indices
        ind[0]=-1;
        ind[1]=-1;
        boolean exists=false; //stores true/false if sum exists

        // //brute force approach
        // for (int i=0;i<n-1;i++){
        //     for (int j=i+1;j<n;j++){
        //         if (arr[i]+arr[j]==t)
        //         {
        //             ind[0]=i;
        //             ind[1]=j;
        //             exists=true;
        //             break;
        //         }
        //     }
        // }
        // //

        // //better approach (with hashing)
        // int remaining_sum=0;
        // for (int i=0;i<n;i++){
        //     remaining_sum= t-arr[i];
        //     if (map.containsKey(remaining_sum)){
        //         exists=true;
        //         ind[1]=i;
        //         ind[0]=map.get(remaining_sum);
        //     }
        // }
        // //

        //optimal approach (two pointer)
        //sort array first
        int temp=0; //for sorting
        for (int i=0;i<n-1;i++){
            if (arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        //sorting end
        //two pointer approach
        int sum;
        int leftInd=0 , rightInd=arr.length-1;
        while (leftInd<rightInd){
            sum=arr[leftInd]+arr[rightInd];
            if (sum==t){
                exists=true;
                ind[0]=leftInd;
                ind[1]=rightInd;
                break;
            }
            else if (sum>t){
                rightInd--;
            }
            else if (sum<t){
                leftInd++;
            }
        }
        //

        //display
        if (exists==true) {
            System.out.println (ind[0]+", "+ind[1]);
        }
        else {
            System.out.println (exists);
        }
        //
    }
}
