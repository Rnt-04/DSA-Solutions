import java.util.Scanner;
class Linear_search
{
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println ("Enter size");
        int l=sc.nextInt();//size of array
        System.out.println ("Enter target element");
        int t=sc.nextInt();//target element
        int [] arr=new int [l];

        System.out.println ("Enter array elements");
        for (int i=0;i<l;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<l;i++){
            if (arr[i]==t){
                System.out.println ("match at index "+i);
            }           
        }        
    }
}