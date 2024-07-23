public class noOfcarry {
    static int Numberofcarry(int num1, int num2){
        int count=0;
        int carry=0;
        
        while(num1!=0||num2!=0){
            int a=num1%10;num1=num1/10;
            int b=num2%10;num2=num2/10;
            int res=a+b+carry;
            if(res>9){carry=1;
            count++;}else{carry=0;}

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(Numberofcarry(999, 111));
        System.out.println(Numberofcarry(451, 349));
    }
}
