class Solution {
    public boolean backspaceCompare(String s, String t) {
        

       return build(s).equals(build(t));
        
    }
    
    static String build(String str) {
        Stack<Character> s = new Stack();
        
        for(char c:str.toCharArray()){
            if(c!='#'){
                 s.push(c);
            } else if(!s.isEmpty()){
                    s.pop();
                }
        } 
        
        return String.valueOf(s);
        
    }
   
}