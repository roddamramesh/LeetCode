class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1 || grid[grid.length-1][grid.length-1]==1)
            return -1;
        if(grid.length==1)
            return 1;
        
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid[0].length;col++){
                if(grid[row][col]==1){
                    grid[row][col]=-1;
                }
            }
        }
        
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});

        boolean[][] visited = new boolean[grid.length][grid.length];
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                if(grid[grid.length-1][grid.length-1]!=0){
                        return grid[grid.length-1][grid.length-1]+1;
                }
                 int[] node= queue.poll();
                 performBFS(grid,node[0],node[1],queue,visited);
                    
            }
            
        }
       
        
        
       return  -1;
    }
    
    public void performBFS(int[][] grid,int row,int col,Queue<int[]> queue, boolean[][] visited){

       
      
        if(row<grid.length-1 && grid[row+1][col]!=-1 && visited[row+1][col]==false){
           grid[row+1][col] =grid[row][col]+1;
            visited[row+1][col]=true;
            queue.offer(new int[]{row+1,col});
        } 
        
         if(row>0 && grid[row-1][col]!=-1 && visited[row-1][col]==false){
            grid[row-1][col]= grid[row][col]+1;
             visited[row-1][col]=true;
             queue.offer(new int[]{row-1,col});
        }
        
        if(col<grid[0].length-1 && grid[row][col+1]!=-1 && visited[row][col+1]==false){
           grid[row][col+1] =  grid[row][col]+1;
            visited[row][col+1]=true;
               queue.offer(new int[]{row,col+1});
        }
        
        if(col>0 && grid[row][col-1]!=-1 && visited[row][col-1]==false){
            grid[row][col-1] = grid[row][col]+1;
            visited[row][col-1]=true;
             queue.offer(new int[]{row,col-1});
        }
        
        if(row<grid.length-1 && col<grid[0].length-1 && grid[row+1][col+1]!=-1 && visited[row+1][col+1]==false){
             grid[row+1][col+1]= grid[row][col]+1;
             visited[row+1][col+1]=true;
              queue.offer(new int[]{row+1,col+1});
        }
        if(row>0 && col<grid[0].length-1 && grid[row-1][col+1]!=-1 && visited[row-1][col+1]==false){
             grid[row-1][col+1]=grid[row][col]+1;
             visited[row-1][col+1]=true;
             queue.offer(new int[]{row-1,col+1});
        }
        if(row<grid.length-1 && col>0 && grid[row+1][col-1]!=-1 && visited[row+1][col-1]==false){
            grid[row+1][col-1]=grid[row][col]+1;
            visited[row+1][col-1]=true;
            queue.offer(new int[]{row+1,col-1});
        }
        if(row>0 && col>0 && grid[row-1][col-1]!=-1 && visited[row-1][col-1]==false){
             grid[row-1][col-1]=grid[row][col]+1;
             visited[row-1][col-1]=true;
             queue.offer(new int[]{row-1,col-1});
        }
        
       
      
    }
}