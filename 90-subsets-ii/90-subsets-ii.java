class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(new ArrayList<Integer>());
        int startIndex = 0; 
        int endIndex=subsets.size();
        
        // If the prev number and current number are same add numbers only to the previous set. else add numbers to all the sets
        for(int i=0;i<nums.length;i++){
             startIndex=0; 
            if(i>0 && nums[i]==nums[i-1])
                startIndex= endIndex;
            
             endIndex=subsets.size();
            for(int j=startIndex;j<endIndex;j++){
                List<Integer> set = new ArrayList<>(subsets.get(j));
                set.add(nums[i]);
                subsets.add(set);  
            }
           
        }
        return subsets;
    }
}