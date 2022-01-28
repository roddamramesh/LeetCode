class Solution {
    boolean res=false;
    public int minKnightMoves(int x, int y) {
        
        x=Math.abs(x);
        y=Math.abs(y);
        
        if(x==1 && y==1){
            return 2;
        }
        
        boolean[][] visited= new boolean[302][302];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        int count=0;
        while(!queue.isEmpty()){
            int size =queue.size();
            for(int i=0;i<size;i++){
                int[] pos= queue.poll();
                findMinMoves(pos[0],pos[1],queue,x,y,visited);
            }
            count++;
            if(res==true){
                return count-1;
            }
        }
        
       
        return -1;
        
    }
    
    public void findMinMoves(int row,int col,Queue<int[]> queue,int targetRow, int targetCol,boolean[][] visited){
        if(row==targetRow && col==targetCol){
            res=true;
            return;
        } 
        if(row<0 || col<0 || col>=302 || row>=302 || visited[row][col]==true){
            return;
        }
        
        visited[row][col]=true;
        queue.offer(new int[]{row+1,col-2});
        queue.offer(new int[]{row+1,col+2});
        queue.offer(new int[]{row+2,col-1});
        queue.offer(new int[]{row+2,col+1});
        queue.offer(new int[]{row-1,col-2});
        queue.offer(new int[]{row-1,col+2});
        queue.offer(new int[]{row-2,col-1});
        queue.offer(new int[]{row-2,col+1});
           
       
    }
}