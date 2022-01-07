class Solution {
    public String mergeAlternately(String word1, String word2) {
        

        StringBuffer sBuffer= new StringBuffer();
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
           sBuffer = sBuffer.append(word1.charAt(i));
           sBuffer = sBuffer.append(word2.charAt(j));
            i++;j++;
        }
         while(i<word1.length()){
          sBuffer = sBuffer.append(word1.charAt(i));
             i++;
         }
            
        while(j<word2.length()){
           sBuffer = sBuffer.append(word2.charAt(j));  
            j++;
        }
           
        return sBuffer.toString();
    }
}