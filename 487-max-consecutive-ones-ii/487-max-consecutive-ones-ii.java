class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int nonZero=0;
        int zero=0;
        
        int maxLength=0;
        int ws=0;
        for(int we=0;we<nums.length;we++){
            if(nums[we]!=0){
                nonZero++;
            } else{
                zero++;
            }
            
            if(we-ws+1-nonZero>1){
               if(nums[ws]==0){
                   zero--;
               }else{
                   nonZero--;
               }
                ws++;
            }
            maxLength= Math.max(maxLength,we-ws+1);
        }
        
        return maxLength;
    }
}