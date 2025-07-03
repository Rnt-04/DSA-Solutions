import java.util.*;
class removeDupliFromSortedArray{
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array ");
        int n=sc.nextInt ();
        sc.nextLine();
        System.out.println ("Enter array elemets in ascending order (space separated)");
        String s[]=sc.nextLine().split(" ");
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        //

        //remove duplicates
        ArrayList <Integer> list= new ArrayList<>();
        list.add(arr[0]);
        for (int i=1;i<n;i++){
            if (list.get(list.size()-1)!=arr[i]){
                list.add(arr[i]);
            }
        }

        //display
        for (int elem: list){
            System.out.print (elem+" ");
        }
    }
}