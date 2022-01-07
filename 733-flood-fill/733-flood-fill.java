class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int color = image[sr][sc];
        if (color != newColor) 
        fillNewColor(image,newColor,sr,sc,image.length,image[0].length,image[sr][sc]);
        return image;
        
        
    }
    
    
    public void fillNewColor(int[][] image,int newColor, int sr, int sc,int rows,int cols,int oldColor){
        
         
        if(image[sr][sc]==oldColor){
            image[sr][sc]=newColor;
            if(sr>=1)
                fillNewColor(image,newColor,sr-1,sc,rows,cols,oldColor);
            if(sc>=1)
                fillNewColor(image,newColor,sr,sc-1,rows,cols,oldColor);
            
            if(sr+1<rows)
                fillNewColor(image,newColor,sr+1,sc,rows,cols,oldColor);
           if(sc+1<cols)
                fillNewColor(image,newColor,sr,sc+1,rows,cols,oldColor);
                
        }
        
       return;
            
        
    }
}