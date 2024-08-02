
import java.util.HashMap;

/*
 Write a function to validate if the provided two strings are anagrams or not.
  If the two strings are anagrams, then return ‘yes’. Otherwise, return ‘no’.
 */

public class anagramStrings {
    
    static String checkanagram(String s1,String s2){
        String st1=s1.toLowerCase();
        String st2=s2.toLowerCase();

        HashMap<Character,Character> stcheck=new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            
            stcheck.put(st1.charAt(i), st1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            if(!stcheck.containsValue(st2.charAt(i))){
                return "no";
            }
        }

        
        
        return "yes";
    }
    public static void main(String[] args) {
        System.out.println(checkanagram("Listen","Silent"));
        
        System.out.println(checkanagram("Li","Si"));
    }
}
