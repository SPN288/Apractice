public class snakewaterGun {
    
    static int scoreOf(String s,int p){
        int s1=0;
        int s2=0;
        for (int i = 0; i < s.length(); ) {
            switch (s.charAt(i)) {
                case 's' -> {
                    i+=5;
                    switch (s.charAt(i)) {
                        case 'w' -> {
                            s1++;
                            i+=5;
                        }
                        case 'g' -> {
                            s2++;
                            i+=3;
                        }
                        default -> {
                        }
                    }
                }


                case 'w' -> {
                    i+=5;
                switch (s.charAt(i)) {
                    case 'g' -> {
                        s1++;
                        i+=3;
                    }
                    case 's' -> {
                        s2++;
                        i+=5;
                    }
                    default -> {
                    }
                }
                }
                case 'g' -> {
                    i+=3;
                switch (s.charAt(i)) {
                    case 'w' -> {
                        s2++;
                        i+=5;
                    }
                    case 's' -> {
                        s1++;
                        i+=5;
                    }
                    default -> {
                    }
                }
                }
                default -> {
                }
            }
        }

        if(p==1){return s1;}else{return s2;}
    }
    public static void main(String[] args) {
        System.out.println(scoreOf("snakewaterwatersnake", 2));
    }
}
