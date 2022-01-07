class Solution {
    public int removeElement(int[] nums, int val) {
    int nonDuplicate = 0;
        
        for(int i=0; i<nums.length; i++){
          
            if(nums[i]!=val){
                nums[nonDuplicate] = nums[i];
                nonDuplicate++;
            } 
          
        }
        return nonDuplicate;
        
    }
}