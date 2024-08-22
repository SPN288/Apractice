
public class secondLargestSmallest{
    static void second(int[] arr) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] < smin && arr[i] > min) {
                smin = arr[i];
            }
        }
        System.out.println("Second Max =" + smax + " Second Min =" + smin);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 0};
        int arr2[] = {8, 10, 5, 7, 9};
        second(arr);
        second(arr2);

    }
}
