//You are given an array of prices where prices[i] is the price of a given stock on an ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. 
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
import java.util.*;
public class buySellStocks {
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
        
        int profit=0;
        int max=0;
        int buyInd=0; int sellInd=0;

        // //brute force
        // for (int i=0;i<n-1;i++){
        //     for (int j=i+1;j<n;j++){
        //         profit=arr[j]-arr[i];
        //         if (profit>0 && profit>max){
        //             max=profit;
        //             buyInd=i;
        //             sellInd=j;
        //         }
        //     }
        //     profit=0;
        // }
        // //

        //optimum solution
        int minPrice=Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            if (arr[i]<minPrice){
                minPrice=arr[i];
                buyInd=i;
            }
            profit = arr[i]-minPrice; 
            if (profit>max){
                max=profit;
                sellInd=i;
            }
        }

        //display
        System.out.println ("Maximum profit= "+max);
        System.out.println ("Buy on day: "+(buyInd+1));
        System.out.println ("Sell on day: "+(sellInd+1)); 
    }
}
