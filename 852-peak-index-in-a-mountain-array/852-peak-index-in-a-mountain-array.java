class Solution {
    public int peakIndexInMountainArray(int[] A) {
        
       return findPeak(A,0,A.length-1);
        
    }
    
    int findPeak(int[] nums, int start, int end){
        int mid= (start+end)/2;
        
        if(start==end){
            return start;
        }
        
        if(nums[mid]>nums[mid+1]){
            return findPeak(nums, start,mid);
        } else{
            return findPeak(nums,mid+1,end);
        }
    }
}