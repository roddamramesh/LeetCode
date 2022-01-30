class Solution {
    int maxPathSum=Integer.MIN_VALUE;
    public int getMaximumGold(int[][] grid) {
        
        Queue<int[]> queue = new LinkedList<>();
        
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]!=0){
                    queue.offer(new int[]{row,col});
                }
            }
        }
        
        while(!queue.isEmpty()){
            int[] pair = queue.poll();
            boolean[][] visited = new boolean[grid.length][grid[0].length];
            findMaxPath(grid,pair[0],pair[1],visited,grid[pair[0]][pair[1]],grid[pair[0]][pair[1]]+"");
        }
        
        return maxPathSum==Integer.MIN_VALUE?0:maxPathSum;
        
    }
    
    public void findMaxPath(int[][] grid,int row, int col, boolean[][] visited, int pathSum, String path){
        
            if(pathSum>maxPathSum){
                maxPathSum=Math.max(pathSum,maxPathSum);
                System.out.println("MaxPath Sum : " + pathSum + " And  Paths is "+path);

            }
  
           visited[row][col]=true;
            if(row+1<grid.length && visited[row+1][col]==false && grid[row+1][col]!=0)
                findMaxPath(grid,row+1,col,visited, pathSum + grid[row+1][col],path+"-"+grid[row+1][col]);
             if(row-1>=0 && visited[row-1][col]==false && grid[row-1][col]!=0)
                findMaxPath(grid,row-1,col,visited, pathSum + grid[row-1][col],path+"-"+grid[row-1][col]);
             if(col+1<grid[0].length && visited[row][col+1]==false && grid[row][col+1]!=0)
                findMaxPath(grid,row,col+1,visited, pathSum + grid[row][col+1],path+"-"+grid[row][col+1]);
             if(col-1>=0 && visited[row][col-1]==false && grid[row][col-1]!=0)
                findMaxPath(grid,row,col-1,visited, pathSum + grid[row][col-1],path+"-"+grid[row][col-1]);
            visited[row][col]=false; 
          
    }
}