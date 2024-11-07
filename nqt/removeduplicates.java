package nqt;
import java.util.*;


public class removeduplicates {

	static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
		System.out.println();
    }

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		print(arr);
		
		HashSet<Integer>hs=new HashSet<>();
		int[] ans=new int[n];
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(hs.contains(arr[i])){
				continue;
			}else{
				hs.add(arr[i]);
				ans[count]=arr[i];
				count++;
			}
		}
		print(ans);

	}
    
}
