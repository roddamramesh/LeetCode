class Solution {
    
    // Add all chars with counts into hashMap
    // Add all the entries into minHeap sorted by values
    // Retrive all values from Minheap and append to string
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<Character,Integer>();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<Map.Entry<Character,Integer>> maxHeap = new PriorityQueue<Map.Entry<Character,Integer>>((e1,e2)->e2.getValue()-e1.getValue());
            
        maxHeap.addAll(hm.entrySet());
        while(!maxHeap.isEmpty()){
            Map.Entry<Character,Integer> entry = maxHeap.poll();
            int count= entry.getValue();
            while(count>0){
                sb.append(entry.getKey());
                count--;
            }
        }
        
        return sb.toString();
        
        
    }
}