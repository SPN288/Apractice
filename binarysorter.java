public class binarysorter {

    // public static String hot(String s){
        
    //     StringBuilder sb=new StringBuilder();
    //     for (int i = 0; i < s.length();i++) {
    //         sb.append(s.charAt(i));
        
    //     }
    //     int x=sb.length();
    //     for(int j=0;j<x;j++){
    //         for (int i = 0; i < sb.length()-1;) {
            
    //             if(sb.charAt(i)=='1'&&sb.charAt(i+1)=='0'){
    //                 sb.deleteCharAt(i);
    //                 i++;
    //             }else{
    //             i++;}
    //         }
    //     }
        

    //     return sb.toString();
        
    // }
    public static String hot(String s){
        
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < s.length();i++) {
            sb.append(s.charAt(i));
        
        }
        int size=sb.length()-1;
        while (size!=0) { 
            if(sb.charAt(size)=='0'&&sb.charAt(size-1)=='1'){
                sb.deleteCharAt(size-1);
            }else{size--;}
        }
        

        return sb.toString();
        
    }

    public static void main(String[] args) {
        System.out.println(hot("11101010111110101111110000001101"));
    }
    
}
