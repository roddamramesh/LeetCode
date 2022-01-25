class Solution {
    boolean res=false;
    public boolean exist(char[][] board, String word) {
       boolean[][] visited = new boolean[board.length][board[0].length];
        
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[0].length;col++){
                if(board[row][col]== word.charAt(0)){
                    wordExist(board,word,row,col,0,visited);
                    if(res==true)
                        return true;
                }
            }
        }
        
        
        return res;
    }
    
    public void wordExist(char[][]board, String word, int row,int col,int k,boolean[][] visited){
        
        if(k==word.length()){
          res =true;  
            return;
        }
        
        
        if(row<0||row>=board.length || col<0 || col>=board[0].length|| visited[row][col]==true)
            return;
        
       
     
          
            if(board[row][col]==word.charAt(k)){
                visited[row][col]=true;
                wordExist(board,word,row+1,col,k+1,visited);
                wordExist(board,word,row-1,col,k+1,visited);
                wordExist(board,word,row,col+1,k+1,visited);
                wordExist(board,word,row,col-1,k+1,visited);
                visited[row][col]=false;
            }
    }
}