public class digitcheck {
    public static void main(String[] args) {
        char a='a';char b='3';
        String s="satya123Prakash";
        System.out.println(Character.isDigit(a));
        System.out.println(Character.isDigit(b));
        System.out.println(Character.isDigit(b));

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i)+"="+ Character.isDigit(s.charAt(i)));
        }
    }
}
