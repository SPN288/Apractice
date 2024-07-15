public class differenceOfSum {
    /*The function def differenceofSum(n. m) accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive)
    that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.
    Input
    sample->n:4
            m:20
            Output
            90 */

    static int diff(int n,int m){
        int ans=0;
        int sd=0;
        int snd=0;

        for (int i = 0; i <= m; i++) {
            if(i%n==0){sd+=i;}else{snd+=i;}
        }
        ans=snd-sd;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(diff(4, 20));
        System.out.println(diff(3, 10));
    }
    
}
