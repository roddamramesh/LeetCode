class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setOfIntegers = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(setOfIntegers.contains(nums[i])){
                return true;
            } else {
               setOfIntegers.add(nums[i]); 
            }
        }
        return false;
        
    }
}