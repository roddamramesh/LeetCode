class Solution {
    int count=0;
    public int totalNQueens(int n) {
        int[][] chess = new int[n][n];
        solveNQueens(chess,0);
        return count;
        
    }
    
    
    
    public void solveNQueens(int[][] chess,int row){
        
        if(row==chess.length){
            count++;
            return;
        }
        
        
        for(int col=0;col<chess.length;col++) {
            if(isSafeToPlaceQueen(chess,row,col)){
                chess[row][col] =1;
                solveNQueens(chess,row+1);
                chess[row][col] =0;    
            } 
        }
    }
    
    
    //check in 3 directions for every row. Vertical to the top and 2 diagonals
    public boolean isSafeToPlaceQueen(int[][] chess, int row,int col){
        
        for(int i=row-1,j=col;i>=0;i--){
            if(chess[i][j]==1){
                return false;
            }
        }
        
        //diagonal to till left top
        for(int i=row-1,j=col-1;i>=0 && j>=0;i-- ,j--){
            if(chess[i][j]==1){
                return false;
            }
            
        }
        
        //diagonal to till right Top
        for(int i=row-1,j=col+1;i>=0 && j<chess.length;i-- ,j++){
             if(chess[i][j]==1){
                return false;
            }
        }
        
        return true;
    }
}