/*Select the minimum element from the array and swap it to the first position. Shorten the array from the front and repeat.
*/

import java.util.*;
public class selectionSort {
    public static void main (String [] args)
    {
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println ("Enter array elements (space separated)");
        String [] s=(sc.nextLine().split(" "));
        int arr[]=new int [n];
        for (int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }
        
        //sorting
        int temp,min;
        for (int i=0;i<arr.length-1;i++)
        {
            min=arr[i];
            for (int j=i;j<arr.length;j++)
            {
                if (arr[j]<arr[i]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int elem: arr){
            System.out.print(elem + " ");
        }
    }
}
