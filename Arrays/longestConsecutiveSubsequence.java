import java.util.*;
public class longestConsecutiveSubsequence {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array ");
        int n=sc.nextInt ();
        int arr[]=new int [n];
        System.out.println("Enter array elements: ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        //
        //optimal approach 
        Set <Integer> set= new HashSet<>();
        for (int i=0;i<n;i++){
            set.add(arr[i]);
        }
        int cnt=0;
        int longest=0;
        for (int elem: set){
            if (!set.contains(elem-1))
            {
                cnt=1;
                int x=elem;
                while (set.contains(x+1))
                {
                    x+=1;
                    cnt+=1;
                }
                longest=Math.max(longest,cnt);
            }
        }
        //
        System.out.println (longest);
    }
}
