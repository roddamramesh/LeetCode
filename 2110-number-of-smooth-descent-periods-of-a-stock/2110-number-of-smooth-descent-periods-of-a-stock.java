class Solution {
    public long getDescentPeriods(int[] prices) {
        int ws=0;
        long count=1;
        for(int we=1;we<prices.length;we++){
            if(prices[we]==prices[we-1]-1){
                count += we-ws+1;
            } else {
                 ws=we;
                count++;
            }
        }
       
       return count;
    }
}