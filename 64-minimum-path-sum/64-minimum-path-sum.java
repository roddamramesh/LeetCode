class Solution {
    int minPathSum=Integer.MAX_VALUE;
    public int minPathSum(int[][] grid) {
        for(int row=grid.length-1;row>=0;row--){
            for(int col= grid[0].length-1;col>=0;col--){
                if(row<grid.length-1 &&  col<grid[0].length-1) {
                    grid[row][col] = Math.min(grid[row+1][col],grid[row][col+1]) + grid[row][col];
                } else if(row==grid.length-1 && col<grid[0].length-1){
                     grid[row][col] = grid[row][col+1] + grid[row][col];
                } else if(col==grid[0].length-1 && row<grid.length-1){
                    grid[row][col] = grid[row+1][col] + grid[row][col];
                } 
            }
        }
        
        return grid[0][0];
    }
    
 
}