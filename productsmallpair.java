public class productsmallpair {
    static int Productsmallpair(int m,int[] arr){
        if(arr==null||arr.length<2){
            return -1;
        }
        int min=Integer.MAX_VALUE;
        int smin=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                smin=min;
                min=arr[i];
                
            }else if(arr[i]<smin){
                smin=arr[i];
            }
        }
        if(m>smin*min){
            return smin*min;
        }
        return 0;

    }
    public static void main(String[] args){
        int[] arr={5,4,2,3,9,1,7};
        int x=9;
        System.out.println(Productsmallpair(x, arr));
    }
}
