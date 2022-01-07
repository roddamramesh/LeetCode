class Solution {
    public int longestPalindromeSubseq(String s) {
        
        int[][] dp = new int[s.length()][s.length()];
        int maxLength=1;
        for(int gap=0; gap<s.length();gap++){
            for(int row=0,col=gap; col<dp.length;row++,col++){
                //parse the diagonals
                if(gap==0){
                    dp[row][col]=1;
                    // If gap is one and both char are equal then it will be 2 characters else 1, Since we can replace only one char 
                } else if(gap==1){
                    if(s.charAt(row)==s.charAt(col)){
                        dp[row][col]=2;
                    } else{
                        dp[row][col]=1;
                    }
                } else {
                    //This case if both char are equal then we take from the previous diagonal value and increment by 2 else we take max of dp[row-1][col] and dp[row][col-1]
                    if(s.charAt(row)==s.charAt(col)){
                        dp[row][col]=dp[row+1][col-1]+2;
                    } else {
                        dp[row][col]=Math.max(dp[row][col-1],dp[row+1][col]);
                    }
                }
                maxLength = Math.max(dp[row][col],maxLength);
            }
            
        }
        return maxLength;
        
    }
}