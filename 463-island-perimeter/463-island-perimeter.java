class Solution {
    int perimeterOfIsland=0;
    public int islandPerimeter(int[][] grid) {
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                   performDFS(grid,row,col); 
                    break;
                }
                  
            }
        }
      return perimeterOfIsland;
    }
    
    
    public void performDFS(int[][] grid,int row, int col){
        
        if(row<0 || row>grid.length-1 || col<0 || col>grid[0].length-1){
            perimeterOfIsland++;
            return;
        }
        if(grid[row][col] ==0){
            perimeterOfIsland++;
            return;
        }
            
        if(grid[row][col] ==-1)
            return;
         grid[row][col] =-1;
        if(row>-1){
            performDFS(grid,row-1,col);
        }
        if(row<grid.length){
             performDFS(grid,row+1,col);
        }
        if(col>-1){
             performDFS(grid,row,col-1);
        }
        if(col<grid[0].length){
            performDFS(grid,row,col+1);
        }
        
    }
}