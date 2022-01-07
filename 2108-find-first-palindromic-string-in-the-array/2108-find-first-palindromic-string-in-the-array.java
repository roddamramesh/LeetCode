class Solution {
    public String firstPalindrome(String[] words) {
        
        for(String word:words){
            if(isPalindrome(word,0,word.length()-1)){
               return word; 
            }
        }
        return "";
    }
    
    public boolean isPalindrome(String word, int start,int end){
        
        while(start<end){
            if(word.charAt(start)==word.charAt(end)){
              start++;
                end--;  
            } else {
                return false;
            }
            
        }
        
        return true;
    }
}