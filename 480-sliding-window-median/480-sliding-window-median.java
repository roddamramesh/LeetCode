class Solution {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer>  minHeap= new PriorityQueue<>();
    public double[] medianSlidingWindow(int[] nums, int k) {
        
        double[] res= new double[nums.length-k+1];
        
        for(int i=0;i<k-1;i++){
            insert(nums[i]);
        }
        
        for(int i=k-1;i<nums.length;i++){
            insert(nums[i]);
            res[i-k+1] = findMedian();
            int elementToBeRemoved = nums[i - k + 1];
            if(elementToBeRemoved <= maxHeap.peek()) {
                maxHeap.remove(elementToBeRemoved);
            } else {
                minHeap.remove(elementToBeRemoved);
            }
            balanceHeap();
           
        }
        return res;
        
    }
    
    public void insert(int num){
        if(maxHeap.isEmpty() || num<= maxHeap.peek()){
            maxHeap.offer(num);
        } else{
            minHeap.offer(num);
        }
        
        balanceHeap();
    }
    
     void balanceHeap(){
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.offer(maxHeap.poll());
        } else if(maxHeap.size()<minHeap.size()){
            maxHeap.offer(minHeap.poll());
        }
         
     }
    
    public double findMedian(){
        if(maxHeap.size()==minHeap.size()){
            return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        } else{
            return maxHeap.peek();
        }
    }
    
    
}