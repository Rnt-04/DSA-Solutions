import java.util.*;
public class RightRotateBy1 {
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
        //rotate
        int last=arr[n-1];
        for (int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;

        //output 
        for (int elem:arr){
            System.out.print (elem+" ");
        }
    }
}
