public class largestelement {
    static int largest(int[] arr){
        int s=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>s){
                s=arr[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[]arr={2,5,1,3,0};
        int arr2[] = {8,10,5,7,9};
        System.out.println(largest(arr));
        System.out.println(largest(arr2));
    }
}
