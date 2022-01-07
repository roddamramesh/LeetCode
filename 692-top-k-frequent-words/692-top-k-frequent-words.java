class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> hm= new HashMap<String,Integer>();
        PriorityQueue<Map.Entry<String,Integer>> minHeap= new PriorityQueue<Map.Entry<String,Integer>>((e1,e2)->e1.getValue()==e2.getValue()?e2.getKey().compareTo(e1.getKey()):e1.getValue()-e2.getValue());
        for(int i=0;i<words.length;i++)
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        
       for(Map.Entry<String,Integer> entry:hm.entrySet()){
           minHeap.offer(entry);
           if(minHeap.size()>k){
               minHeap.poll();
           }
       }
        

        
       List<String> freqWords= new LinkedList<String>();
        while(!minHeap.isEmpty()){
            Map.Entry<String,Integer> entry= minHeap.poll();
            freqWords.add(0,entry.getKey());
          
        }
        
        return freqWords;
        
    }
}