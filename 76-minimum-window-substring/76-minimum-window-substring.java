class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> freq= new HashMap<>();
        int ws=0,minLength=s.length()+1, substrStart=0;
        int matched=0;
        
        // Add all the chars into map
        for(int i=0;i<t.length();i++){
            freq.put(t.charAt(i),freq.getOrDefault(t.charAt(i),0)+1);
        }   
        //decrement the count if you find the match in map and increment matched char. if matched==length of string t then we found a substring.
        for(int we=0;we<s.length();we++){
            char rightChar=s.charAt(we);
            if(freq.containsKey(rightChar)){
               freq.put(rightChar,freq.get(rightChar)-1);
                if(freq.get(rightChar)>=0)
                    matched++;
            }
            // increment ws till matches == t length. if freq becomes zero decrement match andincrement count
            while(matched==t.length()){
                if(minLength>we-ws+1){
                    minLength=we-ws+1;
                    substrStart =ws; 
                }
                char leftChar=s.charAt(ws);
                if(freq.containsKey(leftChar)){
                   
                    if(freq.get(leftChar)==0){
                      matched--;  
                    }
                    freq.put(s.charAt(ws),freq.get(leftChar)+1);
                     
                }
                ws++;
            }
           
            
        }
         return minLength< s.length()+1?s.substring(substrStart,substrStart+minLength):"";
        
    }
        
}