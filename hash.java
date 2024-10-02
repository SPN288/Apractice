
import java.util.ArrayList;
import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        ArrayList<Integer> ll=new ArrayList<>();
        hm.put(2, 1);
        ll.add(22);
        Object[] arr=ll.toArray();
        for (Object elem : arr) {
            System.out.println(elem);
        }

    }
}
