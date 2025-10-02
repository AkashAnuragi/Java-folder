public class BuynSell2 {
    public int maxProfit(int prices[]) {
        int profits = 0;
        for(int i = 1;i<prices.length;i++){
            if(prices[i] >prices[i-1]) {
                profits += prices[i] - prices[i-1];
            }
        }
        return profits;
    }

    public static void main(String[] args) {
        BuynSell2 obj = new BuynSell2();
        int prices[] = {7,1,5,3,6,4};
        System.out.println( "Output is: " + obj.maxProfit(prices));
    }
    
}
