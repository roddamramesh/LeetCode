class Solution {
    public int minCostII(int[][] costs) {
        int minCost=Integer.MAX_VALUE;
        for(int row=1;row<costs.length;row++){
            
            for(int col=0;col<costs[0].length;col++){
                int minSum= Integer.MAX_VALUE;
                for(int temp=0;temp<costs[0].length;temp++){
                    if(temp!=col){
                       minSum = Math.min(costs[row-1][temp],minSum);
                    }
                }
                costs[row][col] =  costs[row][col]+ minSum  ;
                minSum = Integer.MAX_VALUE;
            }
        }
        
        
         for(int col=0;col<costs[0].length;col++){ 
            minCost = Math.min(costs[costs.length-1][col],minCost); 
        }
       
        return minCost;
        
    }
}