class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        int[] arr= new int[1001];
        
        List<Integer> lst = new ArrayList<>();
        
        for(int i=0;i<nums1.length;i++){
           
            arr[nums1[i]]= arr[nums1[i]]+1;
            
        }
        
        for(int j=0;j<nums2.length;j++){
            if(arr[nums2[j]]>0){
               lst.add(nums2[j]);
                arr[nums2[j]]=arr[nums2[j]]-1;
            }
        }
        return lst.stream().mapToInt(i->i).toArray();
    }
}