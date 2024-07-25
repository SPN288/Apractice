import java.util.ArrayList;

public class nearestSmallerTower {

//    static int[] smallesttower(int[] arr){
//     int[] res=new int[arr.length];
    
//     for (int i = 0; i < arr.length; i++) {
//         int min=i;
//         for (int j = 0; j < arr.length; j++) {
//             if(i==j){continue;}
//             if(arr[j]<arr[min]){
//                 min=j;
//             }else if(arr[j]==arr[min]&&Math.abs(i-min)>Math.abs(i-j)){
//                 min=j;
//             }
//         }
//         res[i]=min;
//         if(res[i]==i){
//             res[i]=-1;
//         }
//     }
    
//     return res;
//    }

static int[] smallesttower(int[] arr){
    int[] res=new int[arr.length];
    ArrayList<Integer> ll=new ArrayList<>();
    int min=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]<arr[min]){min=i;}
    }
    //System.out.println("samall->"+min);
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==arr[min]){ll.add(i);}
    }
    //System.out.println(ll);
    for (int i = 0; i < arr.length; i++) {
        res[i]=i;
        for (int j = 0; j < ll.size(); j++) {

            res[i]=Math.min(res[i],Math.abs(i-ll.get(j)));
        }
        // if(res[i]==i){
        //                res[i]=-1;
        //           }
    }
    
    return res;
   }

   static void printer(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
    System.out.println();
   }

   public static void main(String[] args) {
       int[] arr={1,2,3};
       printer(arr);
       printer(smallesttower(arr));
       int[] arr2={4, 8, 3, 5, 3};
       printer(arr2);
       printer(smallesttower(arr2));

   }
    
}
