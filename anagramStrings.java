import java.util.HashMap;

/*
 * This class provides a method to determine if two strings are anagrams of each other.
 * An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
 * typically using all the original letters exactly once.
 */
public class anagramStrings {

    /**
     * This method checks if two strings are anagrams.
     * 
     * @param s1 The first string to compare.
     * @param s2 The second string to compare.
     * @return "yes" if the strings are anagrams, "no" otherwise.
     */
    static String checkanagram(String s1, String s2) {
        // Convert both strings to lowercase to ensure the comparison is case-insensitive.
        String st1 = s1.toLowerCase();
        String st2 = s2.toLowerCase();

        // Create a HashMap to store characters from the first string.
        HashMap<Character, Character> stcheck = new HashMap<>();
        
        // Iterate through each character in the first string and store it in the HashMap.
        for (int i = 0; i < st1.length(); i++) {
            stcheck.put(st1.charAt(i), st1.charAt(i));
        }
        
        // Iterate through each character in the second string.
        for (int i = 0; i < st2.length(); i++) {
            // Check if the HashMap contains the character from the second string.
            if (!stcheck.containsValue(st2.charAt(i))) {
                // If not, the strings are not anagrams.
                return "no";
            }
        }
        
        // If all characters from the second string are found in the HashMap,
        // the strings are anagrams.
        return "yes";
    }

    public static void main(String[] args) {
        // Test cases to validate the function.
        System.out.println(checkanagram("Listen", "Silent")); // Expected output: "yes"
        System.out.println(checkanagram("Li", "Si"));         // Expected output: "no"
    }
}
