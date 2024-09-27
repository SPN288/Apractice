public class calculateFrequency {
    static void countFrequency(String s){
        int []arr=new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i]!=0){
                System.out.print((char)(i + 'a'));
                System.out.print(arr[i]+" ");
                
            }
        }
    }
    public static void main(String[] args) {
        countFrequency("aabbccggffjjkkuuyyoiwiuhiubuwbuydvwvutarxrxqyvcdyvwytvewiytevcyt");
    }
}
