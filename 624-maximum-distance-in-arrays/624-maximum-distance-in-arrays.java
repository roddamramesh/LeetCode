class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        Queue<Integer> minPQ = new PriorityQueue<>();
        Queue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> temp = arrays.get(i);
            minPQ.offer(temp.get(0));
            maxPQ.offer(temp.get(temp.size() - 1));
            map.put(temp.get(0), temp.get(temp.size() - 1));
        }
        //make sure min and max are not in the same array
        if (map.get(minPQ.peek()) != maxPQ.peek()) {
            return maxPQ.peek() - minPQ.peek();
        }
        else {
			//poll a min or max, return the larger one
            int temp = minPQ.poll();
            int res1 = maxPQ.peek() - minPQ.peek();
            minPQ.offer(temp);
            
            temp = maxPQ.poll();
            int res2 = maxPQ.peek() - minPQ.peek();
            return Math.max(res1, res2);
        }
        
    
        
    }
}