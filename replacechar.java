public class replacechar {
    static String Replacecharacter(String str1, char ch1,char ch2){
        StringBuilder s=new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)==ch1){
                s.append(ch2);
            }else if(str1.charAt(i)==ch2){
                s.append(ch1);
            }else{s.append(str1.charAt(i));}
        }
        
        return s.toString();
    }

    public static void main(String[] args) {
        String str="apples";
        
        System.out.println(Replacecharacter(str, 'a', 'p'));
    }
}
