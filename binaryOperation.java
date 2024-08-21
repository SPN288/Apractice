
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
    public static int operationsBinaryString (String str)
  {
    if (str == null)
      return -1;
    int res = str.charAt (0) - '0';
    for (int i = 1; i < str.length ();)
      {
	char prev = str.charAt (i);
	  i++;
	if (prev == 'A')
	  res = res & (str.charAt (i) - '0');
	else if (prev == 'B')
	  res = res | (str.charAt (i) - '0');
	else
	    res = res ^ (str.charAt (i) - '0');
	  i++;
      }
    return res;
  }

    public static void main(String[] args) {
        System.out.println("Answer=" + calcu("1C0C1C1A0B1"));//1
        System.out.println("Answer=" + calcu("0C1A1B1C1C1B0A0"));//0
    }
}
