
import java.util.Scanner;

public class automobile {

    static void countVehicle(int V, int W) {
        int y = (4 * V - W) / 2;
        int x = V - y;
        if (W >= 2 && (W % 2 == 0) && V < W) {
            System.out.println("FW=" + x + " TW=" + y);
        } else {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no. of vehicles");
        int V = sc.nextInt();
        System.out.println("Enter total no. of wheels");
        int W = sc.nextInt();
        countVehicle(V, W);
    }
}
