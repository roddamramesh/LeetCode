class Solution {
    public int missingNumber(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        
        boolean[] arr = new boolean[max+2];
        
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=true;
        }
        
        for(int i=0;i<arr.length;i++){
          if(arr[i]==false)
              return i;
        }
        
        
        return 0;
        
    }
}