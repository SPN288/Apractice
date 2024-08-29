public class cocoNutCount {
    static int cocoNut(int boxSize,int need,int days){
        int ans=0;
        int x=need*days;
        if(x%boxSize==0){
            ans=x/boxSize;
        }else{
            ans=1+x/boxSize;
        }



        return ans;
    }

    public static void main(String[] args) {
        System.out.println(cocoNut(16, 2, 8));
        System.out.println(cocoNut(16, 2, 10));
    }
}
