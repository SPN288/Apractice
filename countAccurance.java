import java.util.*;
public class countAccurance {

    static void counter(int[] arr){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                hm.replace(arr[i], hm.get(arr[i])+1);
            }
        }
        for (Map.Entry<Integer,Integer> e:hm.entrySet()) {
            int k=e.getKey();
            int v=e.getValue();
            System.out.println(k+" occured "+v+" times");
        }

    }
    public static void main(String[] args) {
        int[] arr={1,2,1,2,2,3,2,4,5,5,4,3,2,1,6,7,8,8,7,6,9,0,9,8};
        counter(arr);
    }
    
}
