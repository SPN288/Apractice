public class snakewaterGun {
    
    static int scoreOf(String s,int p){
        int s1=0;
        int s2=0;
        for (int i = 0; i < s.length(); ) {
             if(s.charAt(i)=='s'){
                i+=5;
                if(s.charAt(i)=='w'){
                    s1++;
                    i+=5;
                }else if(s.charAt(i)=='g'){
                    s2++;
                    i+=3;
                }else{}
             }else if(s.charAt(i)=='w'){
                i+=5;
                if(s.charAt(i)=='g'){
                    s1++;
                    i+=3;
                }else if(s.charAt(i)=='s'){
                    s2++;
                    i+=5;
                }else{}
             }else if(s.charAt(i)=='g'){
                i+=3;
                if(s.charAt(i)=='w'){
                    s2++;
                    i+=5;
                }else if(s.charAt(i)=='s'){
                    s1++;
                    i+=5;
                }else{}
             }
        }

        if(p==1){return s1;}else{return s2;}
    }
    public static void main(String[] args) {
        System.out.println(scoreOf("snakewaterwatersnake", 2));
    }
}
