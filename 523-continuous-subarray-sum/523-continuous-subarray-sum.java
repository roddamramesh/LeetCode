class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int currSum=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++){
            currSum += nums[i];
            int rem =  currSum%k;
            if(rem<0)
                rem = rem+k;
            if(hm.containsKey(rem)){
                int prev = hm.get(rem);
                if(i-prev>1){
                    return true;
                }
            } else {
                hm.put(rem,i);
            }
        }
        
        return false;
        
    }
}