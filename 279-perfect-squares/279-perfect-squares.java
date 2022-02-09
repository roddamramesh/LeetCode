class Solution {
    public int numSquares(int n) {
        
        int[] sumOfMinSquares = new int[n+1];
        sumOfMinSquares[0] = 0;
        sumOfMinSquares[1] = 1;

        for(int pos=2;pos<=n;pos++)
        {
            int minSum=Integer.MAX_VALUE;
            
            for(int squareStartVal=1; squareStartVal*squareStartVal<=pos;squareStartVal++){
                int rem = pos - squareStartVal*squareStartVal;
                if(sumOfMinSquares[rem]<minSum) {
                    minSum=sumOfMinSquares[rem];
                }
            }
            sumOfMinSquares[pos]=minSum+1;
            
        }
        return sumOfMinSquares[n];
    }
}