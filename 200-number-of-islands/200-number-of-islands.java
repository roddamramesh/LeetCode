class Solution {
    public int numIslands(char[][] grid) {
        
        if(grid.length==0){
            return 0;
        }
        int noOfIslands=0;
        
        for(int row=0; row<grid.length; row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]=='1'){
                    noOfIslands+=dfs(grid,row,col); 
                }
            }
        }
        return noOfIslands;
    }
    
    int dfs(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j]=='0')
            return 0;
        
        grid[i][j]='0';
        dfs(grid, i+1,j);
        dfs(grid, i-1,j);
        dfs(grid, i,j+1);
        dfs(grid, i,j-1);
        return 1;
        
    }
}