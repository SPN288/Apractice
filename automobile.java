
/*
Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:

1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
2nd data, Total number of wheels = W
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
Example :

Input :
200  -> Value of V
540   -> Value of W

Output :
TW =130 FW=70

Explanation:
130+70 = 200 vehicles
(70*4)+(130*2)= 540 wheels

Constraints :

2<=W
W%2=0
V<W
Print “INVALID INPUT” , if inputs did not meet the constraints.
*/

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
