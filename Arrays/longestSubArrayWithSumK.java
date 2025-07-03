//given an array A[] and an integer K, find the longest subarray in A[] that sums to K.
import java.util.*;
class longestSubArrayWithSumK{
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
        System.out.println ("Enter target sum");
        int k=sc.nextInt();
        //
        //find longest subarray
        int max=-1;
        int ind1=0;
        int ind2=0;
        int len=0;
        int sum=0;
        for (int i=0;i<n-1;i++){
            sum=0;
            for (int j=i;j<n;j++){
                sum+=arr[j];
                if (sum==k){
                    len=j-i;
                    if (len>max){
                        max=len;
                        ind1=i;
                        ind2=j;
                    }
                }
            }
        }
        int subArray[]=Arrays.copyOfRange(arr,ind1,(ind2+1)); //creating the longest subarray with given sum  
        System.out.println ("Longest subarray with given sum: "+Arrays.toString(subArray));
    }
}