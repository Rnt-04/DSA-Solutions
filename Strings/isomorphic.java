import java.util.*;
public class isomorphic {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter string 1");
        String s1=sc.nextLine();
        System.out.println("Enter string 2");
        String s2=sc.nextLine();
        //
        //using hashmap
        HashMap <Character, Integer> hash1 =new HashMap<>();
        HashMap <Character,Integer> hash2 = new HashMap<>(); 
        boolean iso=true;
        for (int i=0;i<s1.length();i++){
            if (!hash1.containsKey(s1.charAt(i))){
                hash1.put (s1.charAt(i),i);
            }

            if (!hash2.containsKey(s2.charAt(i))){
                hash2.put (s2.charAt(i),i);
            }

            if (!hash1.get(s1.charAt(i)).equals(hash2.get(s2.charAt(i)))){
                iso=false;
                break;
            }
        }
        //output
        if (iso){
            System.out.println("The strings are isomorphic");
        }
        else System.out.println("Not isomorphic");
        //
    }
    
}
