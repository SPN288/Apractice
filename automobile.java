
import java.util.Scanner;

public class automobile {
    static void countVehicle(int V,int W){
        int y=(4*V-W)/2;
        int x=V-y;
        System.out.println("FW="+x+" TW="+y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int W=sc.nextInt();
        countVehicle(V, W);
    }
}
