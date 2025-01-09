package nqt;

import java.util.ArrayList;

public class AddingElementinanArray {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		System.out.println();
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,4,4,5,5,6,72,4,5};
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i <arr.length; i++) {
         al.add(arr[i]);   
        }
        al.add(0, 69);
        System.out.println(al);
        al.add(al.size(), 69);
        System.out.println(al);
    }
    
}
