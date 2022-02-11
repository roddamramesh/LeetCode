class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length==0){
            return "";
        }
        int indexPos=0;
        for(int i=0;i<strs[0].length();i++){
            boolean breakloop = false;
            char ch = strs[0].charAt(i);
            for(String str:strs){
                if(i==str.length() ||!(str.charAt(i)==ch)){
                   breakloop=true; 
                    break;
                }
            }
            if(breakloop==true)
                break;
            indexPos++;
        }
        
        return strs[0].substring(0,indexPos);
        
    }
}