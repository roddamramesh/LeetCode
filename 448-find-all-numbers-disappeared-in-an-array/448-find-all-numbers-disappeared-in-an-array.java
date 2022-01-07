class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        
        List<Integer> lst= new ArrayList<Integer>();
        while(i<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]= nums[i];
                nums[i]=temp;
            } else {
                i++;
            }
        }
        int k=0;
        while(k<nums.length){
            if(nums[k]-1!=k){
                lst.add(k+1);
                k++;
            } else {
                k++;
            }
        }
        return lst;
        
    }
}