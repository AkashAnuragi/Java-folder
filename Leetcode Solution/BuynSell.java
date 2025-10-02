public class BuynSell{
    public int  stockProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for(int price : prices) {
        if(price <minPrice){
            minPrice = price;
        }else if(price - minPrice > maxProfit) {
            maxProfit = price - minPrice;
        }
    }
    return maxProfit;
        
    }

    public static void main(String[] args) {
        BuynSell obj = new BuynSell();
        int prices[] = {7,1,5,3,6,4};
        System.out.println("Max profit: " + obj.stockProfit(prices)  );
    }
    
}
