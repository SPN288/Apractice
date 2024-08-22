public class Palindrome {
    static boolean pali(int num){
        String s=String.valueOf(num);
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        
        
        return true;
    }
    public static void main(String[] args) {
        int x=1234554321;
        System.out.println(pali(x));
    }
}
