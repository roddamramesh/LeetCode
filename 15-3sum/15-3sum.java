class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
        List<List<Integer>> triplets =  new ArrayList<List<Integer>>();
        /**
        * if i and i-1 elements are same skip it. since duplicate triplets should be avoided.
        * x+y+z=0; y+Z =-x.
        * So we pass -x value into the function searchPair as target value and we pass the left index position.
        */
        for(int i=0;i<nums.length-2;i++) {
           if(i>0 && nums[i]==nums[i-1])
               continue;
              searchPair(nums,-nums[i],i+1,triplets); 
        }
        
       
        return triplets;
    }
    
    /**
    * Just like pair with target sum problem. we need to run a while loop and check if nums[l] + nums[r] == targetSum.if true
    * store in triplet else if nums[l] + nums[r]>targetSum do r-- else do l++;
    * 
    *
    */
   void searchPair(int[] nums,int targetSum,int l,List<List<Integer>> triplets){
        int r=nums.length-1;
       while(l < r){
            if(nums[l]+nums[r]==targetSum){
                triplets.add(Arrays.asList(-targetSum,nums[l],nums[r]));
                l++; r--;
                // To skip the duplicate triplet check the prev l and current l is not same
                 while(l<r && nums[l]==nums[l-1]){
                    l++;
                }
               // To skip the duplicate triplet check the prev r and current r is not same
                while(l<r && nums[r]==nums[r+1]){
                    r--;
                }
            } else if(nums[l]+nums[r] > targetSum){
               r--;
           } else{
               l++;
           }
        }
    }
 
}