class Solution {
    int result=0;
    public int climbStairs(int n) {
       
        int[] memo = new int[n+1];
        
       return climbStairs(n,memo);
    
    }
    
    public int climbStairs(int n,int[] memo) {
        if(memo[n]!=0)
            return memo[n];
        
        if(n<=2){
           return n;  
        } else {
          result= climbStairs(n-1,memo) +climbStairs(n-2,memo);  
        }
        memo[n]= result;
        return result;
    
    }
    
    
}