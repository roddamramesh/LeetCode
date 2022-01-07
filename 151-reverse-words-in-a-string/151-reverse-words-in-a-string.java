class Solution {
    public String reverseWords(String s) {
        
        String[] originalArray = s.split(" ");
        int start=0;
        int end= originalArray.length-1;
        StringBuilder sb= new StringBuilder();
        while(start<end){
            String temp = originalArray[start].trim(); 
            originalArray[start]= originalArray[end].trim();
            originalArray[end]=temp;
            start++;
            end--;
        }
        
        for(String str :originalArray){
            if(!str.isEmpty()){
                sb = sb.append(str); 
                sb = sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}