class Solution {
    public int maxProfit(int[] prices) {
        
        int j=0;
        int count=0;
        for(int i=1; i < prices.length; i++) {
            
            if(prices[j] < prices[i]){
              count= count + prices[i] - prices[j];  
               
            }
             j++;
            
        }
        return count;
        
    }
}