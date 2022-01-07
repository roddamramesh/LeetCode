class Solution {
    public String[] reorderLogFiles(String[] logs) {
        
        Comparator<String> myComp = new Comparator<String>(){
          
            @Override
            public int compare(String s1,String s2){
                int s1Index = s1.indexOf(' ');
                int s2Index = s2.indexOf(' ');
                char s1FChar = s1.charAt(s1Index+1);
                char s2FChar = s2.charAt(s2Index+1);
                
                if(s1FChar<='9'){
                    if(s2FChar <= '9'){
                        return 0;
                    } else{
                        return 1;
                    }
                }
                
                if(s2FChar <= '9')
                    return -1;
                
                int computeSubstring = s1.substring(s1Index+1).compareTo(s2.substring(s2Index+1));
                if(computeSubstring==0){
                    return s1.substring(0,s1Index).compareTo(s2.substring(0,s2Index));
                    
                }
                return computeSubstring;
            }
            
        };
        
         Arrays.sort(logs,myComp);
        return logs;
        
    }
}