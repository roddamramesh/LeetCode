class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
      nums1=mergeArray(nums1,m,nums2,n);
        
        int i=0;
        int j=nums1.length-n;
        
        while(i<j && j<nums1.length){
            if(nums1[i]>nums1[j]){
                int temp= nums1[i];
                nums1[i]= nums1[j];
                int k=j;
                while(k-1>i){
                  nums1[k]= nums1[k-1];
                    k--;
                }
                i++;
                nums1[i] = temp;
                j++;
                
            } else {
                i++;
            }
        }
        
        
    }
    
    public int[] mergeArray(int[] nums1,int m,int[] nums2, int n){
        int i=0;
        while(m<nums1.length){
            nums1[m]=nums2[i];
            i++;m++;
        }
        
        return nums1;
    }
}