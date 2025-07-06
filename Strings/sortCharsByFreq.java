import java.util.*;
public class sortCharsByFreq {
    public static void main (String [] args){
        //input
        Scanner sc=new Scanner (System.in);
        System.out.println ("Enter a string");
        String s=sc.nextLine();
        sc.close();
        //
        //using hashmap and list sorting
        String ans="";
        HashMap <Character, Integer> hm = new HashMap<>();
        for (char ch: s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch, 0)+1);
        }
        List <Character> list= new ArrayList(hm.keySet());
        list.sort ((ob1,ob2) -> hm.get(ob2)-hm.get(ob1));
        for (char ch:list){
            for (int i=0;i<hm.get(ch);i++){
                ans+=ch;
            }
        }
        System.out.println (ans);
    }
}
