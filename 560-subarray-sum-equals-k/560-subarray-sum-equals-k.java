class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int currSum=0;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            currSum+=nums[i];
            if(hm.containsKey(currSum-k))
                count+=hm.get(currSum-k);
             hm.put(currSum,hm.getOrDefault(currSum,0)+1);   
        }
        return count;
    }
}