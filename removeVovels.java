import java.util.*;
public class removeVovels {
    static String vovremover(String s){
        StringBuilder sb=new  StringBuilder();
        HashMap<Character, Integer> hm = new HashMap();
        hm.put('a', 1);
        hm.put('e', 2);
        hm.put('i', 3);
        hm.put('o', 4);
        hm.put('u', 5);
        for (int i = 0; i < s.length(); i++) {
            if(hm.containsKey(s.charAt(i))){
                continue;
            }else{sb.append(s.charAt(i));}
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(vovremover("Satya Prakash"));
    }
}
