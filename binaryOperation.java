
public class binaryOperation {

    static char calcu(String s) {
        //A and
        //B or
        // c Xor
        char ans = s.charAt(0);
        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i) == 'B') {
                if (ans == '1' || s.charAt(i + 1) == '1') {
                    ans = '1';
                    continue;
                } else {
                    ans = '0';
                    continue;
                }
            }
            if (s.charAt(i) == 'A') {
                if (ans == '1' && s.charAt(i + 1) == '1') {
                    ans = '1';
                    continue;
                } else{
                    ans = '0';
                    continue;
                }
            }
            if (s.charAt(i) == 'C') {
                if (ans == '1' || s.charAt(i + 1) == '1') {
                    ans = '1';
                    
                } else if(ans == '0' || s.charAt(i + 1) == '0'){
                    ans = '1';
                }else{ans='0';}
            }
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println("Answer=" + calcu("1C0C1C1A0B1"));//1
        System.out.println("Answer=" + calcu("0C1A1B1C1C1B0A0"));//0
    }
}
