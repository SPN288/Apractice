public class removeelement {
    static void remove(int[] arr , int x){
        int inx=0;
        int l=arr.length;
        for (int i = 0; i < l; i++) {
            if(arr[i]==x){inx=i;}
        }
        for (int i = inx; i < l-1; i++) {
            
            arr[i]=arr[i+1];
        }
        arr[l-1]=0;
    }
    static void printer(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }

    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5,6,7,8};
        printer(arr1);
        remove(arr1,4);
        printer(arr1);
    }
    
}
