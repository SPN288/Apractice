
import java.util.ArrayList;

public class lol {
    static  void per(String[]qrr){
        ArrayList<String>ll=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String s=qrr[i];
            for (int j = 0; j < 3; j++) {
                if(i==j){continue;}
                s+=qrr[j];
            }ll.add(s);
        }
        for (int i = 0; i < 3; i++) {
            String s=qrr[i];
            for (int j = 2; j >= 0; j--) {
                if(i==j){continue;}
                s+=qrr[j];
            }ll.add(s);
        }
        System.out.println(ll);
    }
    
    public static void main(String[] args) {
        String[] arr={"ab","cd","ef"};
        per(arr);
    }
}
