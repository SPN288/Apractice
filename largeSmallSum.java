
public class largeSmallSum {

    static int lssum(int[] arr) {
        if (arr == null || arr.length <= 3) {
            return 0;
        }

        int m = arr[0];
        int sm = 0;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                if (arr[i] > m) {
                    sm = m;
                    m = arr[i];
                } else if (arr[i] > sm) {
                    sm = arr[i];
                }
            } else {
                if (arr[i] < min) {
                    smin = min;
                    min = arr[i];
                } else if (arr[i] < smin) {
                    smin = arr[i];
                }
            }
        }

        return smin + sm;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 2, 1, 7, 5, 4};
        System.out.println(lssum(arr1));

    }

}
