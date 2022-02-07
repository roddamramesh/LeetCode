class Solution {
    public int minCostII(int[][] costs) {
        int minCost=Integer.MAX_VALUE;
        
        int least = Integer.MAX_VALUE;
        int sLeast = Integer.MAX_VALUE;
        
        for(int col=0;col<costs[0].length;col++){
            if(costs[0][col]<=least){
                sLeast = least;
                least = costs[0][col];
            } else if(costs[0][col]<sLeast){
                sLeast= costs[0][col];
            }
        }
        
        for(int row=1;row<costs.length;row++){
            
            int tempLeast=Integer.MAX_VALUE;
            int tempSLeast = Integer.MAX_VALUE;
            for(int col=0;col<costs[0].length;col++){
               
                if(costs[row-1][col]==least){
                     costs[row][col] =  costs[row][col] + sLeast;
                } else {
                     costs[row][col] =  costs[row][col] + least;
                }
                if(costs[row][col]<=tempLeast){
                    tempSLeast = tempLeast;
                    tempLeast = costs[row][col];
                } else if(costs[row][col]<tempSLeast){
                    tempSLeast= costs[row][col];
                }
                
               
            }
            least= tempLeast;
            sLeast=tempSLeast;
            
        }
        
        
        for(int col=0;col<costs[0].length;col++){ 
            minCost = Math.min(costs[costs.length-1][col],minCost); 
        }
       
        return minCost;
        
    }
}