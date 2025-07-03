import java.util.*;
class input {
    public static void main (String []args){
        Scanner sc=new Scanner (System.in);
        String s[]=sc.nextLine().split(" ");
        int arr[] =new int [2];
        arr[0]=Integer.parseInt(s[0]);
        arr[1]=Integer.parseInt(s[1]);
        System.out.println (arr[0]);
        System.out.println (arr[1]);
    }
}