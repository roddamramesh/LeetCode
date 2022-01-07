class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
        int[] cells1= new int[cells.length];
        int noOfRotations;
        boolean flag=true;
         N%=14;
        
        if(N==0)
            N=14;
            
            for(int i=0;i<N;i++){
                
                for(int j=1;j<cells.length-1;j++){
                    if(cells[j-1]==cells[j+1]){
                        cells1[j]=1;
                    }else{
                        cells1[j]=0;
                    }       
                }
                if(flag==true){
                    cells1[0]=0;
                    cells1[cells1.length-1]=0;
                    cells[0]=0;
                    cells[cells1.length-1]=0;
                    flag=false;
                }
                int[] temp=cells;
                cells=cells1;
                cells1=temp;
                    
            }
        
        return cells;
        
    }
}