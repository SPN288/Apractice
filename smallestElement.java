public class smallestElement {

    static int smallest(int[] arr){
        int s=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<s){
                s=arr[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        int[]arr={2,5,1,3,0};
        int arr2[] = {8,10,5,7,9};
        System.out.println(smallest(arr));
        System.out.println(smallest(arr2));
    }
    
}
