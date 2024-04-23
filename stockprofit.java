import java.util.*;
public class stockprofit{
    public static int buyAndSellingStock(int price[]){
        int BuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i<price.length ;i++){
            if(BuyPrice < price[i]){//Profit
            int Profit = price[i] - BuyPrice ;  // Today Profit
            maxProfit = Math.max(maxProfit, Profit);
        }
        else{
            BuyPrice = price[i];
        }
    }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println("The highest Profit in Stock market is : " +buyAndSellingStock(price));
    }
}