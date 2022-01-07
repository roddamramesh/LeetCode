class Solution {
    public int orangesRotting(int[][] grid) {
        boolean hasFreshOrange=false;
        Queue<Point> q = new LinkedList<>();
        
        // Add all rotten oranges into queue
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                      q.offer(new Point(i,j)); 
                }
                if(grid[i][j]==1){
                   hasFreshOrange= true; 
                }
             
            }
        }
        // Edge cases
        if(q.isEmpty() && hasFreshOrange==true){
           return -1; 
        } else if(q.isEmpty()) {
            return 0;
        }
        
        //
        int noOfMinutes=0;
        while(!q.isEmpty()){
            int count=q.size();
            // For Finding Minutes
            for(int i=0;i<count;i++){
                 Point p= q.poll();
                 performBSF(p.x,p.y,q,grid);
            }
           noOfMinutes++;
        }
        
        // To check if any fresh oranges present
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                      return -1;
                }
             
            }
        }
        return noOfMinutes-2;
        
    }
    // Logic to perform bsf and add the corresponding top,bottom left and right fresh oranges into queue
    public void performBSF(int i,int j,Queue<Point> q,int[][] grid){
        
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0||grid[i][j]==0)
            return;
        if(grid[i][j]==1||grid[i][j]==2){
            grid[i][j]=0;
        }
        q.offer(new Point(i+1,j));
        q.offer(new Point(i-1,j));   
        q.offer(new Point(i,j+1));  
        q.offer(new Point(i,j-1));      
           
    }
    
    
    
    
    class Point {
        int x;
        int y;
        public Point(int x,int y){
            this.x=x;
            this.y=y;
        }
        
    } 
}