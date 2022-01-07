class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
        if(k<=1)
            return 0;
        int runningProduct=1;
        int ws=0;
        int count=0;
        for(int we=0;we<nums.length;we++){
            runningProduct *= nums[we];
          
            while(runningProduct>=k)
                runningProduct /= nums[ws++];
            count+=we-ws+1;
            
        }
        
       
        return count;
    }
}