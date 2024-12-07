package oop;

import java.util.HashMap;

public class matrix {

    static boolean validSuduko(char arr[][]) {

        HashMap<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != ' ' && hm.containsKey(arr[i][j])) {
                    return false;
                } else {
                    hm.put(arr[i][j], arr[i][j]);
                }
            }
            hm.clear();
        }
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[0].length; i++) {
                if (arr[i][j] != ' ' && hm.containsKey(arr[i][j])) {
                    return false;
                } else {
                    hm.put(arr[i][j], arr[i][j]);
                }
            }
            hm.clear();
        }
        for (int j = 0; j < arr.length; j++) {

            if (arr[j][j] != ' ' && hm.containsKey(arr[j][j])) {
                return false;
            } else {
                hm.put(arr[j][j], arr[j][j]);
            }

        }
        hm.clear();
        for (int j = 0; j < arr.length; j++) {

            if (arr[j][arr.length-j-1] != ' ' && hm.containsKey(arr[j][arr.length-j-1])) {
                return false;
            } else {
                hm.put(arr[j][arr.length-j-1], arr[j][arr.length-j-1]);
            }

        }

        return true;
    }

    public static void main(String[] args) {
        char[][] arr = {{'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}};
        System.out.println(validSuduko(arr));

        for (int j = 0; j < arr.length; j++) {

            System.out.println(arr[j][arr.length-j-1]);
        }

    }
}
