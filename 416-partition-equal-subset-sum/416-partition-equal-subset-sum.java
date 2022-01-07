class Solution {
    public boolean canPartition(int[] nums) {
        
        int sum=0;
        for(int i=0;i<nums.length; i++){
            sum= sum+nums[i];
        }
        
        if(sum%2==1){
            return false;
        } else {
            Boolean[][] memo = new Boolean[nums.length][sum/2+1];
            return canPartition(memo,nums, sum/2,0);
        }
        
        
    }
    
    public boolean canPartition(Boolean[][] memo, int[] nums,int sum,int currIndex){
        
        if(sum==0)
            return true;
        
        if(nums.length==0 || currIndex>=nums.length)
            return false;
       
        if(memo[currIndex][sum]==null){
            
            if(nums[currIndex]<=sum){
                if(canPartition(memo,nums,sum-nums[currIndex],currIndex+1)){
                  memo[currIndex][sum]= true;
                   return memo[currIndex][sum];
                }
                    
            }
            memo[currIndex][sum] = canPartition(memo,nums,sum,currIndex+1);
        }
        
       return memo[currIndex][sum];
        
        
    }
}