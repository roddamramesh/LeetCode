class Solution {
    public int rob(int[] nums) {
        
       if(nums.length==1)
           return nums[0];
        int oddHouseRob = findMaxRob(0,nums.length-1,nums);
        int evenHouseRob = findMaxRob(1,nums.length,nums);
        
        return Math.max(oddHouseRob,evenHouseRob);
    }
    
    public int findMaxRob(int start,int end, int[] nums){
        
        int oldInclude = nums[start];
        int oldExclude = 0;
       
        
        for(int i=start+1;i<end;i++){
            int newInclude = oldExclude +nums[i];
            int newExclude = Math.max(oldExclude,oldInclude);
            
            oldInclude = newInclude;
            oldExclude = newExclude;
        }
        return Math.max(oldInclude,oldExclude);
    }
}