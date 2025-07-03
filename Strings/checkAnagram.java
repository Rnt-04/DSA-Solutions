import java.util.*;
public class checkAnagram {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first string");
        String s1=sc.nextLine();
        System.out.println("Enter the second string");
        String s2=sc.nextLine();
        sc.close();
        //
        boolean anagram=true;
        
        // //using hashmap
        // Map <Character, Integer> hash = new HashMap<>();
        // if (s1.length()!=s2.length()){
        //     anagram=false;
        // }
        // else{
        //     for (int i=0;i<s1.length();i++){
        //     hash.put (s1.charAt(i), hash.getOrDefault(s1.charAt(i),0) + 1);
        //     }
        // }
        // for (int i=0;i<s2.length();i++){
        //     if (!hash.containsKey(s2.charAt(i)) || hash.get(s2.charAt(i))==0) {
        //         anagram=false;
        //         break;
        //     }
        //     hash.put(s2.charAt(i), hash.get(s2.charAt(i))-1);
        // }
        // //

        //by sorting
        char[] c1=s1.toCharArray();
        char [] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (!Arrays.equals(c1, c2)){
            anagram=false;
        }
        //

        //display
        if (anagram) System.out.println("Anagrams");
        else System.out.println("Not anagrams"); 
    }
}
