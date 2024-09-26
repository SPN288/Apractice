public class sumOfNoInString {
    static int sum(String s){
        int sum=0;
        String temp="0";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                temp+=s.charAt(i);
            }else{
                sum+=Integer.parseInt(temp);
                temp="0";
            }
            if(i==s.length()-1){
                sum+=Integer.parseInt(temp);
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum("123s1s2fjh4"));
    }
}
