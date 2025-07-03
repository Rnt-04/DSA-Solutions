import java.util.*;
public class linearSearch {
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
        System.out.println ("Enter element to search");
        int k=sc.nextInt();
        //
        linearSearch ob1=new linearSearch();
        ob1.search(arr,k);
    }

    public void search (int a[],int n){
        int index=-1;
        boolean found=false;
        for (int i=0;i<a.length;i++){
            if (a[i]==n){
                found=true;
                index=i;
                break;
            }
        }
        if (found){
            System.out.println ("Element found at index "+index);
        }
        else {
            System.out.println ("Element not found");
        }
    }
}
