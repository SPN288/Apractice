package nqt;

public class inputs {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		System.out.println();
    }
    
    static void print(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static boolean isSubset(String w1,String w2){
        int[]s1=new int[26];
        int[]s2=new int[26];
        for(int i=0;i<w1.length();i++){
            s1[(int)w1.charAt(i)-97]++;
        }
        print(s1);
        for(int i=0;i<w2.length();i++){
            s2[(int)w2.charAt(i)-97]++;
        }
        print(s2);

        for(int i=0;i<w2.length();i++){
            
            if(s1[(int)w2.charAt(i)-97]<s2[(int)w2.charAt(i)-97]){
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        
        System.out.println(isSubset("google","loo"));

    }
}
