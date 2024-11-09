package nqt;

import java.util.HashMap;

public class subarrayEqualsToTarget {
    static void psaett(int[] arr,int target){
            HashMap<Integer,Integer> hm=new HashMap<>();
            int cs=0;
            for(int i=0;i<arr.length;i++){
                cs+=arr[i];
                if (cs==target) {
                    for (int j = 0; j <=i ; j++) {
                        System.out.print(arr[j]+" ");
                    }
                    System.out.println();
                }
                if (hm.containsKey(cs-target)) {
                    for (int j = hm.get(cs-target)+1; j <=i ; j++) {
                        System.out.print(arr[j]+" ");
                    }
                }
                hm.put(arr[i], i);
            }
    }
    public static void main(String[] args) {
        int [] arr={3,4,-7,1,3,3,1,-4};
        psaett(arr, 7);
    }
}
