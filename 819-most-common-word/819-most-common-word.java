class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String,Integer> hm = new HashMap<>();
        Set<String> hs= new HashSet<>();
        String maxRepeated = "";
        int maxCount=0;
        paragraph= paragraph.replaceAll("[^\\w\\s]"," ");
        String[] arr = paragraph.split(" ");
        
        for(int i=0;i<banned.length;i++){
            hs.add(banned[i].toLowerCase());
        }
        
        for(String str: arr){
            String temp=str.toLowerCase();
            if(!hs.contains(temp) && !"".equals(temp)){
                hm.put(temp,hm.getOrDefault(temp,0)+1);
            }
        }
        
        for(Map.Entry<String,Integer> entry:hm.entrySet()){
            if(entry.getValue()>maxCount){
                maxCount=entry.getValue();
                maxRepeated=entry.getKey();
            }
        }
        
        return maxRepeated;
        
    }
}