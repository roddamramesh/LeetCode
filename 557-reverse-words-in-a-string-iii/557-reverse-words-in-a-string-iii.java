class Solution {
    public String reverseWords(String s) {
        
            
        StringBuilder sb= new StringBuilder();
        for(String str: s.split(" ")){
            sb =sb.append(reverseString(str.toCharArray(),0,str.length()-1));
            sb= sb.append(" ");
        }
       return sb.toString().trim();
    }
    
    String reverseString(char[] originalArray,int start,int end){
       
        while(start<end){
            char temp = originalArray[start];
            originalArray[start]=originalArray[end];
            originalArray[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(originalArray);
    }
}