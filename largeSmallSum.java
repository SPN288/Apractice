public class largeSmallSum {

    /**
     * This method calculates the sum of the largest number at even indices and the second smallest number
     * at odd indices in an array.
     * 
     * @param arr An array of integers.
     * @return The sum of the largest number at even indices and the second smallest number at odd indices.
     *         Returns 0 if the array is null or has 3 or fewer elements.
     */
    static int lssum(int[] arr) {
        // If the array is null or has 3 or fewer elements, return 0 as the result.
        if (arr == null || arr.length <= 3) {
            return 0;
        }

        // Initialize variables to keep track of the largest number at even indices (m),
        // the second largest number at even indices (sm), the smallest number at odd indices (min),
        // and the second smallest number at odd indices (smin).
        int m = arr[0];
        int sm = 0;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        // Iterate through the array starting from the second element.
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                // For even indices, update the largest (m) and second largest (sm) values.
                if (arr[i] > m) {
                    sm = m;  // Update the second largest to the previous largest.
                    m = arr[i];  // Update the largest value.
                } else if (arr[i] > sm) {
                    sm = arr[i];  // Update the second largest value.
                }
            } else {
                // For odd indices, update the smallest (min) and second smallest (smin) values.
                if (arr[i] < min) {
                    smin = min;  // Update the second smallest to the previous smallest.
                    min = arr[i];  // Update the smallest value.
                } else if (arr[i] < smin) {
                    smin = arr[i];  // Update the second smallest value.
                }
            }
        }

        // Return the sum of the largest number at even indices (m) and the second smallest number at odd indices (smin).
        return smin + m;
    }

    public static void main(String[] args) {
        // Test case: Array with numbers at both even and odd indices.
        int[] arr1 = {3, 2, 1, 7, 5, 4};
        // Print the result of lssum with the given array.
        System.out.println(lssum(arr1));  // Expected output: 7 + 4 = 11
    }
}
