package day2;


public class StockBuyAndSell {
    public int maxProfit(int[] prices) {
        int low = 0;
        int max = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] < prices[low]) 
                low = i;
            else
                max = max > prices[i]-prices[low] ? max : prices[i]-prices[low];
            
        } 
        return max;      
    }
}