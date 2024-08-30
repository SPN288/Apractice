public class lowrecaseCount {

    static String st(String s){
        String ans="";
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)>='a'&& s.charAt(i)<='z'){
                ans+=s.charAt(i);
                count++;
            }
        }
        ans=ans+":"+count;

        return ans;
    }


    
    public static void main(String[] args) {
        System.out.println(st("SaTyA Is here To check if The Code I wrote YesTerdayt was CorrEct or Not"));
        
    }
}
