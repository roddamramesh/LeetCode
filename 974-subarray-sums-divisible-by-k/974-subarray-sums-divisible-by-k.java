class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        int currSum=0;
        int count=0;
        Map<Integer,Integer> hm= new HashMap<>();
        
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            currSum+= nums[i];
            int rem = currSum%k;
            if(rem<0)
                rem=rem+k;
            if(hm.containsKey(rem)){
                count += hm.get(rem);
                hm.put(rem,hm.get(rem)+1);
            } else {
                  hm.put(rem,1);
            }
        }
        
      
        
        return count;
    }
}