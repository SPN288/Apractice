public class fibo {
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] feb=new long[n];
        feb[0]=1;
        if(n==1){return feb;}
        feb[1]=1;
        if(n==2){return feb;}
        for(int i=2;i<n;i++){
            feb[i]=feb[i-1]+feb[i-2];
        }
        return feb;
    }
    static void printer(long[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       }
    public static void main(String[] args) {
        printer(printFibb(10));
    }
}
