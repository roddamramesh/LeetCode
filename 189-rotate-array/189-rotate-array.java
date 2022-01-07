class Solution {
    public void rotate(int[] nums, int k) {
        int end = nums.length-1;
        k = k%nums.length;
        int diff = end-k+1;
        if(nums.length>1){
            rotate(nums, diff,end);
            rotate(nums, 0,diff-1);
            rotate(nums, 0,end);
        } 
    }
    
    public void rotate(int[] nums,int start, int end){
         while(start < end){
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]= temp;
             start++;
             end--;
        }
        
    }
    
        
}