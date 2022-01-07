class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] spiralMatrix = new int[n][n];
        
        int rowMin=0;
        int colMin=0;
        int colMax=n-1;
        int rowMax=n-1;
        int count=0;
        int totalElements=n*n;
        
        while(count<totalElements) {
            
            for(int col=colMin, row=rowMin;col<=colMax && count<totalElements;col++){
                spiralMatrix[row][col]=++count;
            }
            rowMin++;
            
            for(int row=rowMin, col=colMax;row<=rowMax && count<totalElements;row++){
                spiralMatrix[row][col]=++count;
            }
            colMax--;
            
             for(int col=colMax, row=rowMax;col>=colMin && count<totalElements;col--){
                spiralMatrix[row][col]=++count;
            }
            rowMax--;
            
             for(int row=rowMax, col=colMin;row>=rowMin && count<totalElements;row--){
                spiralMatrix[row][col]=++count;
            }
            colMin++;
            
            
        }
        
        return spiralMatrix;
    }
}