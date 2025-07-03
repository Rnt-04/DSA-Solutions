import java.util.*;
class maxInArray{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);

        //input
        System.out.println ("Enter size of array ");
        int n=sc.nextInt ();
        int arr[]=new int [n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //

        //finding max
        int max=arr[0];
        int maxIndex=0;
        for (int i=1;i<n;i++){
            if (arr[i]>max){
                max=arr[i];
                maxIndex=i;
            }
        }

        //output
        System.out.println ("Max element: "+max+" at index: "+maxIndex);
    }
}