class Solution {
    public int[][] merge(int[][] intervals) {
        
    /**
    * In order to merge the overlapping intervals we need to sort them by the zero lements.
    * then it will be easy to merge
    */
        
        Arrays.sort(intervals,new Comparator<int[]>(){
          public int compare(int[] a, int[] b){
             return Integer.compare(a[0],b[0]);
          }
      });
       LinkedList<int[]> merged = new LinkedList<>();
    for (int[] interval : intervals) {
      // Add to the linked list if the list is empty or check with end position of last linkedlist with current start position of linkedlist.
      // If true then they dont overlap. if they overlap get the max element from the end index.
      if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
        merged.add(interval);
      }
      // if there is overlap,  we merge the current and previous intervals.
      else {
        merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
      }
    }

    return merged.toArray(new int[merged.size()][]);
        
    }
    
    
}

