class Solution {
    // Add Comparator to act as minHeap
    // Add k elements to minHeap
    // After k elementscheck every number with minHeap Value. if its greater add it to min heap and it performs heapify which is O(log K) time Complexity.
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> minHeap= new PriorityQueue<Integer>((n1,n2)->n1-n2);
        
        for(int i=0;i<nums.length;i++){
            minHeap.offer(nums[i]);
            if(minHeap.size()>k){
                minHeap.poll();
                
            }
        }
        
        // for(int i=k;i<nums.length;i++){
        //     if(nums[i]>minHeap.peek()){
        //         minHeap.poll();
        //         minHeap.offer(nums[i]);
        //     }
        // }
        
        return minHeap.peek();
        
    }
}