public class Circle {
    public static int mindist(char a, char z) {
        // Convert characters to integer values (ASCII values)
        int a1 = a;
        int a2 = z;

        // Calculate the absolute difference between the two characters
        int d1 = Math.abs(a2 - a1);

        // Calculate the alternative distance by considering the circular nature of the alphabet
        // We subtract the difference from 26 to get the shorter path around the circle
        int d2 = Math.abs(Math.abs(a2 - a1) - 26);

        // Return the minimum of the two distances
        return Math.min(d1, d2);
    }

    public static int minTimeToType(String word) {
        int count = 0;

        // Calculate the initial distance to reach the first character from 'a'
        count += mindist(word.charAt(0), 'a');
        // Increment the count for the initial key press
        count++;

        // Iterate over consecutive characters in the word
        for (int i = 0; i < word.length() - 1; i++) {
            // Calculate the distance between the current and next characters
            count += mindist(word.charAt(i), word.charAt(i + 1));
            // Increment the count for the key press
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        String word = "bza";
        System.out.println(minTimeToType(word)); // Output: 7
        System.out.println(mindist('a', 'a'));     // Output: 0
    }
}