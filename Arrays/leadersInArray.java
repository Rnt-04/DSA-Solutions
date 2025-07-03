import java.util.*;
public class leadersInArray {
    public static void main (String args[]){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int [n];
        sc.nextLine();
        System.out.println("Enter array elements (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        sc.close();
        //
        ArrayList <Integer> leaders= new ArrayList<>();  //list to store the leaders
        
        ////brute force
        // for (int i=0;i<n;i++)
        // {
        //     boolean lead=true;
        //     for (int j=i+1;j<n;j++)
        //     {
        //         if (arr[i]<arr[j])
        //         {
        //             lead=false;
        //             break;
        //         }
        //     }
        //     if (lead)
        //     {
        //         leaders.add(arr[i]);
        //     }
        // }
        // //
        //
        //optimal approach 
        int max=Integer.MIN_VALUE;
        for (int i=n-1;i>=0;i--){
            if (arr[i]>max){
                max=arr[i];
                leaders.add(max);
            }
        }
        //
        //display
        for (int elem:leaders){
            System.out.print (elem+" ");
        }
    }
}
