class Solution {
    public char findTheDifference(String s, String t) {
        
        Map<Character,Integer> hm = new HashMap<Character, Integer>();
        
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        
        for(int i=0;i<t.length(); i++){
            if(hm.containsKey(t.charAt(i))){
                hm.put(t.charAt(i),hm.getOrDefault(t.charAt(i),0)-1);
                if(hm.get(t.charAt(i))==0){
                    hm.remove(t.charAt(i));
                }
            } else{
                return t.charAt(i);
            }
        }
        return ' ';
    }
}