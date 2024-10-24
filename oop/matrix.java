package oop;

import java.util.HashMap;

public class matrix {

    static boolean matvalid(char board[][],int i,int j){
        HashMap<Character, Character> hm = new HashMap<>();
        for (int I = i; I < i+3; I++) {
            for (int J = j; J < j+3; J++) {
                
                if (board[I][J] != '.' && hm.containsKey(board[I][J])) {
                                return false;
                            } else {
                                hm.put(board[I][J], board[I][J]);
                            }
            }
           
        }
        return true;
    }

    static boolean validSuduko(char board[][]) {

        HashMap<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && hm.containsKey(board[i][j])) {
                    return false;
                } else {
                    hm.put(board[i][j], board[i][j]);
                }
            }
            hm.clear();
        }

        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.' && hm.containsKey(board[i][j])) {
                    return false;
                } else {
                    hm.put(board[i][j], board[i][j]);
                }
            }
            hm.clear();
        }

        
        for (int i = 0; i < 9; i=i+3) {
            for (int j = 0; j < 9; j=j+3) {
                if(matvalid(board, i, j)){
                
                }else{return false;}
            }
        } 
        return true;
    }

    public static void main(String[] args) {
        char[][] board = 
        {
        {'1', '2', '3','1', '2', '3','1', '2', '3'},
        {'4', '5', '6','4', '5', '6','4', '5', '6'},
        {'7', '8', '9','7', '8', '9','7', '8', '9'},
        {'1', '2', '3','1', '2', '3','1', '2', '3'},
        {'4', '5', '6','4', '5', '6','4', '5', '6'},
        {'7', '8', '9','7', '8', '9','7', '8', '9'},
        {'1', '2', '3','1', '2', '3','1', '2', '3'},
        {'4', '5', '6','4', '5', '6','4', '5', '6'},
        {'7', '8', '9','7', '8', '9','7', '8', '9'}
        };
        System.out.println(validSuduko(board));
        //System.out.println(matvalid(board, 0, 3));
        

    }
}
