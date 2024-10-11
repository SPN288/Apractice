public class stringReducer {

static String reducer(String s){
	int[] a=new int [26];
	
	for(int i=0;i<s.length();i++){
	a[s.charAt(i)-97]++;
	}
	String k="";
	for(int i=0;i<26;i++){
	if(a[i]>0){k=k+(char)(97+i);
			k=k+String.valueOf(a[i]);}
	}
	return k;
	
	

}

public static void main(String[] args) {
    System.out.println(reducer("aaabbbcccdddeeeefffffjklmnopqqqrrsssssttttttttttuuuuuuuuuuuuuuuuuvvvvwwwxxy"));
}
    
}
