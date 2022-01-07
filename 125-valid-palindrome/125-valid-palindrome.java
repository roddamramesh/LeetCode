class Solution {
    public boolean isPalindrome(String s) {
        
        s= s.toLowerCase();
        StringBuffer strBuffer= new StringBuffer();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
               strBuffer = strBuffer.append(c);
            }
        }
        String modifiedStr= strBuffer.toString();
        int left=0;
        int right=modifiedStr.length()-1;
        while(left<right){
            if(modifiedStr.charAt(left)!=modifiedStr.charAt(right))
                return false;
            left++;right--;
        }
        
        return true;     
    }
}