class Solution {
    public int rob(int[] nums) {
        
        int oldInclude = nums[0];
        int oldExclude = 0;
        
        for(int i=1;i<nums.length;i++){
            int newInclude = oldExclude +nums[i];
            int newExclude = Math.max(oldExclude,oldInclude);
            
            oldInclude = newInclude;
            oldExclude = newExclude;
        }
        
        return Math.max(oldInclude,oldExclude);
    }
}