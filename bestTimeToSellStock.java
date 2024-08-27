public class bestTimeToSellStock {
    public static  int maxProfit(int[] prices) {
        int profit=0;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min){}
        }


        return profit;
    }
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println("Profit="+maxProfit(arr));
    }
}
