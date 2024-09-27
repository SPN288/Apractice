public class capital {
    static  String getCapital(String s){
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1; i <s.length()-1 ; i++) {
            if(s.charAt(i+1)==' '){
                sb.append(Character.toUpperCase(s.charAt(i)));       
            }else if(s.charAt(i-1)==' '){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{sb.append(s.charAt(i));}
        }
        sb.append(Character.toUpperCase(s.charAt(s.length()-1)));
        return sb.toString();
    }
    public static void main(String[] args) {
        
        String k="hell i am here with my friends";
        
        System.out.println(getCapital(k));
    }
}
