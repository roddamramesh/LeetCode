class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> lst= new ArrayList<Integer>();
        int ws=0;
        Map<Character,Integer> sCount= new HashMap<>();
        Map<Character,Integer> pCount= new HashMap<>();
        for(int i=0;i<p.length();i++){
            pCount.put(p.charAt(i),pCount.getOrDefault(p.charAt(i),0)+1);
        }
        
        for(int i=0;i<s.length();i++){
              sCount.put(s.charAt(i),sCount.getOrDefault(s.charAt(i),0)+1);
            if(i>=p.length()-1){
                if(isAnagram(pCount,sCount)){
                    lst.add(ws); 
                }
               
                
                if(sCount.get(s.charAt(ws))==1){
                    sCount.remove(s.charAt(ws));
                } else{
                     sCount.put(s.charAt(ws),sCount.get(s.charAt(ws))-1);
                }
                ws++;
            } 
           
        }
            
          return lst;
    }
    
    boolean isAnagram(Map<Character,Integer> pCount,Map<Character,Integer> sCount){
        for(Map.Entry<Character,Integer> entry: pCount.entrySet()){
                    if(sCount.containsKey(entry.getKey())){
                      if(entry.getValue().intValue()!=sCount.get(entry.getKey()).intValue())
                        return false;  
                    } else{
                        return false;
                    }
                    
                }
        return true;
    }
    
  
}