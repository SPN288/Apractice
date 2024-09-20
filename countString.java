/*
 Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal
 */
public class countString {
    static int count(String s){
        int c1=0,c2=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='*'){
                c1++;
            }else if(s.charAt(i)=='#'){
                c2++;
            }
        }
        return(c1-c2);

    }
    public static void main(String[] args) {
        System.out.println(count("****######"));
    }
}
