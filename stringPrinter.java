

public class stringPrinter{

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String s="makeSatyaIsHere";

        for (int i = 0; i < s.length(); i++) {
            char x=s.charAt(i);
            if(x>='A'&&x<='Z'){
                System.out.println();
                System.out.print(Character.toLowerCase(x));
            }else{System.out.print(Character.toUpperCase(x));}
        }
    }
}