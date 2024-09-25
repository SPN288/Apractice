public class removecharacters {
    static String remo(String s) {
        StringBuilder sb=new  StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char m = s.charAt(i);
            if ((m >= 'A' && m <= 'Z') || (m >= 'a' && m <= 'z')) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
        

    }

    public static void main(String[] args) {
        System.out.println(remo("!@#s$%a^&t12y&*a"));
    }
}
