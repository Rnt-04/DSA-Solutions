import java.util.*;
class moveZeroesToEnd{
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
        //move zeroes
        ArrayList <Integer> list= new ArrayList<>();
        int c=0;
        for (int j=0;j<n;j++){
            if (arr[j]==0){
                c++;
            }
            else{
                list.add(arr[j]);
            }
        }
        for (int k=0;k<c;k++){
            list.add(0);
        }

        //display
        for (int elem:list)
        {
            System.out.print (elem+" ");
        }
    }
}