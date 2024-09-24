public class renoveSpaces {
    static String vovremover(String s){
        StringBuilder sb=new  StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                continue;
            }else{sb.append(s.charAt(i));}
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(vovremover("Satya Prakash"));
    }
}
