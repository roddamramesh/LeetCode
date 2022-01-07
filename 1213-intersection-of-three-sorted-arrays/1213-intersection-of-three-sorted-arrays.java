class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
      
        List<Integer> lst= new ArrayList<>();
        int i,j,k;
        i=0;j=0;k=0;
        
        // If the values are equal add to the list and increment all indexes
        // If the values are matching from one array index to other array index increment both index 
        // 
        while(i<arr1.length && j<arr2.length && k<arr3.length){
            if(arr1[i]==arr2[j]&& arr2[j]==arr3[k]){
                lst.add(arr1[i]);
                i++;j++;k++;
            } else if(arr2[j]>arr1[i]){
                i++;
            } else if(arr3[k]>arr2[j]){
              j++;
            } else{
                k++;
            }
        }
        
      return lst;
    }
}