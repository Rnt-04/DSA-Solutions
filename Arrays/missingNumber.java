//Given a number N and an array from 1 to N (missing 1 number), check for the missing number between 1 and N
import java.util.*;
public class missingNumber {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter value of N");
        int n=sc.nextInt();
        int arr[]=new int[n-1];
        sc.nextLine();
        System.out.println ("Enter array elements from 1 to "+ n+ ", excluding any one element (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<n-1;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        //
        //finding the missing number
        int j=0;
        int missN=-1;
        for (int i=1;i<=n;i++){
            if (arr[j]!=i){
                missN=i;
                break;
            }
            j++;
        }
        //output
        System.out.println ("The missing number is: "+missN);
    }
}
