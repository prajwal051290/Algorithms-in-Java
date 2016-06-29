/*Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.*/

public class Solution {
    public int maxProfit(int[] prices) {
    
        int[] minimum = new int[prices.length];
        int latestProfit = 0, maxProfit = 0;
        
        for(int i=0; i<prices.length; i++){
            
            if(i==0)
                minimum[i] = prices[i];
            else
                minimum[i] = Math.min(minimum[i-1],prices[i]);
            
            latestProfit = prices[i] - minimum[i];    
            maxProfit = maxProfit >= latestProfit ? maxProfit : latestProfit;
        }
        return maxProfit;
    }
}