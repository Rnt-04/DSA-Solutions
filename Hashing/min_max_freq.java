import java.util.*;
class min_max_freq{
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        int arr[]= new int[n];
        int hash[]=new int [100001];
        System.out.println("Enter n elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt ();
            hash[arr[i]]++;
        }                  
        
        int minFreq=hash [arr[0]];
        int maxFreq=hash [arr[0]];
        for (int i=0;i<arr.length;i++){
            if (hash[arr[i]]<minFreq){
                minFreq=hash[arr[i]];
            }
            if (hash[arr[i]]>maxFreq){
                maxFreq=hash[arr[i]]; 
            }
        }

        System.out.println ("Min freq= "+minFreq);
        System.out.println("Max freq= "+maxFreq);

    }
}
