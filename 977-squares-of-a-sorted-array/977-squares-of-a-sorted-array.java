class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int[] sortedSquares= new int[nums.length];
        int i=0;
        /**
        * Take left and right pointers starting feom 0th index and array length-1 index.
        * check leftvalue is greater or right after converting value into positive. if left is greater store thr value in newly created array from the end position.
        * and increment left pointer else do the same thing  and decrement right pointer.
        **/
        while(left <= right){
            if(Math.abs(nums[left])>Math.abs(nums[right])){
                sortedSquares[nums.length-1-i] = nums[left] * nums[left];
                left++;
            } else{
                sortedSquares[nums.length-1-i] = nums[right] * nums[right];
                right--;
            }
            i++;
        }
        
        return sortedSquares;
    }
}