class Solution {
    public int numSquares(int n) {
        
        int[] sumOfMinSquares = new int[n+1];
        sumOfMinSquares[0] = 0;
        sumOfMinSquares[1] = 1;
        int minSum=Integer.MAX_VALUE;
        int squareStartVal=1;
        for(int pos=2;pos<=n;pos++)
        {
            while(pos-(squareStartVal*squareStartVal)>=0){
                int square = squareStartVal*squareStartVal;
                if(pos-square>=0 && sumOfMinSquares[pos-square]<minSum){
                   minSum=sumOfMinSquares[pos-square];
                   sumOfMinSquares[pos] = sumOfMinSquares[pos-square]+1;
                    
                }
                squareStartVal++;
            }
            squareStartVal=1;
            minSum=Integer.MAX_VALUE;
        }
        return sumOfMinSquares[n];
    }
}