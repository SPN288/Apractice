public class cricle {
    public static  int mindist(char a,char z){
        int a1=a;
        int a2=z;
        int d1=Math.abs(a2-a1);
        int d2=Math.abs(Math.abs(a2-a1)-26);
        int ans=Math.min(d1,d2);
        return ans;
    }
    public static  int minTimeToType(String word) {
        int count=0;
        count+=mindist(word.charAt(0),'a');
            count++;
        for(int i=0;i<word.length()-1;i++){
            count+=mindist(word.charAt(i),word.charAt(i+1));
            count++;
        }
        
        return count;
    }
    public static void main(String[] args) {
        String word="bza";
        System.out.println(minTimeToType(word));
        System.out.println(mindist('a', 'a'));
        

    }
}
