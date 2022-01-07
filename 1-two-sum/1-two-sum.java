class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] result = new int[2];
       Map<Integer,Integer> mapOfindices = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            if(mapOfindices.containsKey(nums[i])){
                result[0]=i;
                result[1]= mapOfindices.get(nums[i]);
                return result;
            } else {
              mapOfindices.put(target-nums[i],i);  
            }
        }
        return result;
    }
}