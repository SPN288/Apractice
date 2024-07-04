public class differenceOfSum {

    /*
     * The function `diff` calculates the difference between:
     * 1. The sum of all numbers from 1 to m (both inclusive) that are divisible by n.
     * 2. The sum of all numbers from 1 to m (both inclusive) that are not divisible by n.
     * 
     * @param n An integer; numbers divisible by this integer will be considered for one sum.
     * @param m An integer; the range of numbers from 1 to m (inclusive) will be considered.
     * @return The difference between the sum of numbers not divisible by n and the sum of numbers divisible by n.
     * 
     * Example:
     * For n = 4 and m = 20,
     * Numbers divisible by 4 in the range 1 to 20 are: 4, 8, 12, 16, 20
     * Sum of these numbers = 60
     * Numbers not divisible by 4 in the range 1 to 20 are: 1, 2, 3, 5, 6, 7, 9, 10, 11, 13, 14, 15, 17, 18, 19
     * Sum of these numbers = 150
     * Difference = 150 - 60 = 90
     */
    static int diff(int n, int m) {
        // Initialize sums for numbers divisible by n (sd) and not divisible by n (snd)
        int sd = 0; // Sum of numbers divisible by n
        int snd = 0; // Sum of numbers not divisible by n
        
        // Iterate through numbers from 1 to m (inclusive)
        for (int i = 1; i <= m; i++) {
            if (i % n == 0) {
                // Add to the sum of numbers divisible by n
                sd += i;
            } else {
                // Add to the sum of numbers not divisible by n
                snd += i;
            }
        }
        
        // Calculate the difference between the sum of numbers not divisible by n and the sum of numbers divisible by n
        int ans = snd - sd;
        
        // Return the computed difference
        return ans;
    }

    public static void main(String[] args) {
        // Test cases to validate the diff function
        // For n = 4 and m = 20, expected output: 90
        System.out.println(diff(4, 20)); 
        
        // For n = 3 and m = 10, expected output: 22
        System.out.println(diff(3, 10));
    }
}
