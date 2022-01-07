class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();

        subsets.add(new ArrayList<Integer>());
        for(int i=0;i<nums.length;i++){
      
            int count = subsets.size();
            for(int j=0;j<count;j++){
                List<Integer> set = new ArrayList<Integer>(subsets.get(j));
                set.add(nums[i]);
                subsets.add(set);
            }
            
        }
        return subsets;
    }
}