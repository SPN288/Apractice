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
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // String s=sc.nextLine();
        // ArrayList<Integer> al=new ArrayList<>();
        // for (int i = 0; i < s.length(); i++) {
        //     if(Character.isDigit(s.charAt(i))){
        //         al.add(Character.getNumericValue(s.charAt(i)));
        //     }
        // }
        // int[] arr=al.stream().mapToInt(i->i).toArray();
        // print(arr);

        // String[] sr=s.split(",");
        // print(sr);
        String ins="6969,456,10000,9696";
        String[] sk=ins.split(",");
        int [] sks=new int[sk.length];

        for (int i = 0; i < sk.length; i++) {
            
            sks[i]=Integer.parseInt(sk[i]);
        }
        String h="satya";
        String k="str";
        

        //print(sks);
        System.out.println(h.contains(k));


        char a='a';
        int b=(int)a;
        System.out.println(b-97);

    }
}
