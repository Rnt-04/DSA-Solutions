import java.util.*;
class leftRotateBy_K_Places{
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

        System.out.println ("Enter number of places to rotate array by: ");
        int k=sc.nextInt();
        //
        //rotate
        int temp[]=new int[k];
        for (int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for (int j=k;j<n;j++){
            arr[j-k]=arr[j];
        }
        int x=0;
        for (int i=n-k;i<n;i++){
            arr[i]=temp[x];
            x++;
        }
        //
        //display
        for (int elem:arr){
            System.out.print (elem+" ");
        }
    }
}