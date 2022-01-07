class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        
        int rowMin =0;
        int rowMax= matrix.length-1;
        int colMin=0;
        int colMax=matrix[0].length-1;
        
        int totalElements=matrix.length * matrix[0].length;
       
        while(list.size()<totalElements){
            
            for(int col=colMin, row=rowMin; col<=colMax && list.size()<totalElements; col++){
                list.add(matrix[row][col]);
              
            }
            rowMin++;
            for(int row=rowMin, col=colMax; row<=rowMax && list.size()<totalElements; row++){
                list.add(matrix[row][col]);
                
            }
            colMax--;
            for(int col=colMax, row=rowMax; col>=colMin && list.size()<totalElements; col--){
                list.add(matrix[row][col]);
                
            }
            rowMax--;
             for(int row=rowMax, col=colMin; row>=rowMin && list.size()<totalElements; row--){
               list.add(matrix[row][col]);
                
            }
            colMin++;
        }
        
       
        return list;
    }
}