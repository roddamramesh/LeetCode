class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> lst= new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=nums[nums[i]-1]){
                int temp = nums[nums[i]-1];
                nums[nums[i]-1]= nums[i];
                nums[i]= temp;
                
            }
        }
        
        int j=0;
        while(j<nums.length){
            
            if(nums[j]!=j+1){
              lst.add(nums[j]);  
            } 
            j++;
            
        }
        return lst;
    }
}