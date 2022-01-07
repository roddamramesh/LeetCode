class Solution {
    public int missingElement(int[] nums, int k) {
        
        
        int pos=0;
        int diff =nums[0];
        
        //Find the difference with first element and check for elvery value at index - index should give same difference.
        //if the difference doesnot match check how many numbers are missing with respect to diff and increment diff also increment the pos to keep track of ith position. if it matches with k then return else take the last number in array and substract k-pos.
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]-i!=diff){
                while(diff<nums[i]-i){
                     pos++;
                    if(pos==k){
                        return diff+i;
                    }
                    diff++;
                   
                }
            }
        } 
        return nums[nums.length-1]+k-pos;
    }
}