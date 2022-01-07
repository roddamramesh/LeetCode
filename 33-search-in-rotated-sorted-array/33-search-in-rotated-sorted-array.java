class Solution {
    public int search(int[] nums, int target) {
        
        
        if(nums[0]<nums[nums.length-1]){
          return search(nums,target,0,nums.length-1);  
        } else {
            int pivot = findPivot(nums);
            int  pos =  search(nums,target,0,pivot);
            return pos!=-1?pos:search(nums,target,pivot+1,nums.length-1);

        }
   
        
    }
    
    static int findPivot(int[] nums){
        int start=0;
        int end = nums.length-1;
        
        int pivot=0;
        while(start<=end){
            if(start==end){
                return end;
            }
            int mid= start + (end-start)/2;
            
             
           if(start<mid && nums[mid]<nums[mid-1]){
               return mid-1;
           } else if(mid<end && nums[mid]>nums[mid+1]){
               return mid;
           } 
            
            if(nums[mid]>nums[start]){
                start=mid+1;
            } else {
                end=mid-1;
            }
          
                
        }
        return pivot;
    }
    
    static int search(int[] nums,int target, int start,int end){

         while(start<=end){
            
             int mid= start + (end-start)/2;
             if(nums[mid]>target){
                 end= mid-1;
             } else if(nums[mid]<target) {
                 start= mid+1;
             } else{
                 return mid;
             }
         }
        return -1;
    }
}