class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] nums1= new int[nums.length];
        
            nums1[0] = nums[0];        
        for(int i=1;i<nums.length; i++){
            nums1[i] = nums1[i-1] + nums[i];
        }
        
        return nums1;
        
    }
}