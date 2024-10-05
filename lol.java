
import java.util.*;

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
        //String[] arr={"ab","cd","ef"};
        //per(arr);
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("Satya",52);
        hm.put("Satwika",51);
        hm.put("Saurabh",54);
        hm.put("Sanu",55);
        int x=0;
        for(Map.Entry<String,Integer> m:hm.entrySet()){
            System.out.println(m.getValue());
            x=m.getValue();
        }
        System.out.println(x);



    }
}
