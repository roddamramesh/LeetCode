class Solution {
    public void rotate(int[][] matrix) {
        
        
        transpose(matrix);
        reverse(matrix);
       
        
        
       
        
    }
    
    public void reverse(int[][] matrix){
       
        
        for(int row=0;row<matrix.length;row++){
            int colMin=0;
            int colMax=matrix.length-1;
            while(colMin<colMax){
                int temp = matrix[row][colMin];
                matrix[row][colMin] = matrix[row][colMax];
                matrix[row][colMax]=temp;
                colMin++;
                colMax--;
            }
           
            
        }
        
    }
    
    public void transpose(int[][] matrix){
        
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp =matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
    }
    
    
    
    
}