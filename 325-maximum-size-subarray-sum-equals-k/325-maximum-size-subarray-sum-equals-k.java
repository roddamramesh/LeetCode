class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        
        int rSum=0;
        int maxLength= Integer.MIN_VALUE;
        HashMap<Integer,Integer> mapOfIndicies = new HashMap<>();
        
        for(int we=0;we<nums.length;we++){
            rSum +=nums[we];
            if(rSum==k){
                maxLength=we+1;
            }
            
            if(mapOfIndicies.containsKey(rSum-k)){
               maxLength = Math.max(we-mapOfIndicies.get(rSum-k),maxLength); 
            }
            if(!mapOfIndicies.containsKey(rSum))
                 mapOfIndicies.put(rSum,we);  
            
            
        }
        
        return maxLength==Integer.MIN_VALUE?0:maxLength;
        
    }
}