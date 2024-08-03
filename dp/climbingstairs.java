package dp;

public class climbingstairs {

    public static int countStairs(int n){
        int [] res=new int[n+1];
        res[0]=1;
        res[1]=1;
        for (int i = 2; i <= n; i++) {
            res[i]=res[i-1]+res[i-2];
        }
        return (res[n]);
    }

    public static void main(String[] args){
        
        System.out.println(countStairs(4));
        System.out.println(countStairs(5));
    }
    
}
