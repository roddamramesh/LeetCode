class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int indexPos=0;
        for(int i=0;i<strs[0].length();i++){
            boolean breakloop = false;
            char ch = strs[0].charAt(i);
            for(String str:strs){
                if(i>str.length()-1 ||!(str.charAt(i)==ch)){
                   breakloop=true; 
                    break;
                }
            }
            if(breakloop==true)
                break;
            indexPos++;
        }
        
        return indexPos>0?strs[0].substring(0,indexPos):"";
        
    }
}