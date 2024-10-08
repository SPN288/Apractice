public class stringhash {


	static String sep(String s){
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='#'){
				s1=s1+s.charAt(i);
			}else{
			  s2=s2+s.charAt(i);
			}
		
		}
		return(s1+s2);

	}

    public static void main(String[] args){
	
	System.out.println(sep("S#a#t#y#a"));
    }
}
