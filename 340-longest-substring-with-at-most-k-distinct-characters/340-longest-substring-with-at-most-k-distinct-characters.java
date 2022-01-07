class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
         int ws=0;
        int maxLength=0;
        Map<Character,Integer> hm= new HashMap<>();
        for(int we=0;we<s.length();we++){
            hm.put(s.charAt(we),hm.getOrDefault(s.charAt(we),0)+1);
         
            while(hm.size()>k){
                if(hm.get(s.charAt(ws))>1){
                    hm.put(s.charAt(ws),hm.get(s.charAt(ws))-1);
                    ws++;
                } else {
                    hm.remove(s.charAt(ws++));
                }
            }
            
            maxLength= Math.max(maxLength,we-ws+1);  
        }
        
        return maxLength;
    }
}