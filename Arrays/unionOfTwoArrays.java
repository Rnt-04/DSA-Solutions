//using set. Works for both sorted and unsorted array.

import java.util.*;
class unionOfTwoArrays{
    public static void main (String[] args){
        //input array 1
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter size of array 1");
        int m=sc.nextInt();
        int arr1[]=new int[m];
        sc.nextLine();
        System.out.println ("Enter array 1 elements (space separated)");
        String s[]=sc.nextLine().split(" ");
        for (int i=0;i<m;i++){
            arr1[i]=Integer.parseInt(s[i]);
        }
        //input array 2
        System.out.println ("Enter size of array 2");
        int n=sc.nextInt();
        int arr2[]=new int[n];
        sc.nextLine();
        System.out.println ("Enter array 2 elements (space separated)");
        String str[]=sc.nextLine().split(" ");
        for (int i=0;i<n;i++){
            arr2[i]=Integer.parseInt(str[i]);
        }
        //
        //Union using set
        ArrayList <Integer> list=new ArrayList<>();
        HashSet <Integer> st= new HashSet<>();
        for (int i:arr1){
            st.add(i);
        }
        for (int j:arr2){
            st.add(j);
        }
        for (int x:st){
            list.add(x);
        }

        //display
        for (int elem: list){
            System.out.print (elem+" ");
        }   
    }
}