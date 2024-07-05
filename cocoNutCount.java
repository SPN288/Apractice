public class cocoNutCount {

    /**
     * This method calculates the number of boxes needed to store a given number of coconuts.
     * 
     * @param boxSize The number of coconuts that can fit in one box.
     * @param need The number of coconuts needed per day.
     * @param days The total number of days for which coconuts are needed.
     * @return The number of boxes required to store the total number of coconuts needed.
     */
    static int cocoNut(int boxSize, int need, int days) {
        // Calculate the total number of coconuts needed over the given number of days.
        int totalCoconuts = need * days;
        
        // Calculate the number of boxes required.
        // If the total number of coconuts is exactly divisible by the box size,
        // the number of boxes is the total number divided by the box size.
        // If not, an additional box is needed to accommodate the remaining coconuts.
        int boxesRequired;
        if (totalCoconuts % boxSize == 0) {
            boxesRequired = totalCoconuts / boxSize;
        } else {
            boxesRequired = 1 + totalCoconuts / boxSize;
        }

        // Return the number of boxes required.
        return boxesRequired;
    }

    public static void main(String[] args) {
        // Test cases to validate the cocoNut method.
        // Example 1: Box size is 16, need is 2 coconuts per day, and for 8 days.
        // Total coconuts needed: 2 * 8 = 16. Number of boxes needed: 16 / 16 = 1.
        System.out.println(cocoNut(16, 2, 8));  // Expected output: 1

        // Example 2: Box size is 16, need is 2 coconuts per day, and for 10 days.
        // Total coconuts needed: 2 * 10 = 20. Number of boxes needed: 1 + (20 / 16) = 2.
        System.out.println(cocoNut(16, 2, 10)); // Expected output: 2
    }
}
