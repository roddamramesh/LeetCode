class Solution {
    public int countSubstrings(String s) {
        int count=0;
       for(int i=0;i<s.length();i++){
           count+=(expandFromCenter(s,i,i)+expandFromCenter(s,i,i+1));
       }
        return count;
    }
    
    
    public int expandFromCenter(String s,int start,int end){
      
        int count=0;
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            start--;
            end++;
            count++;
        }
        return count;
    }
}