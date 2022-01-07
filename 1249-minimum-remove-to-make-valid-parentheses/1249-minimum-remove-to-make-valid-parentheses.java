class Solution {
    public String minRemoveToMakeValid(String s) {
        
        Stack<Character> stack = new Stack<>();
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(')'==charArray[i]){
                    if((stack.isEmpty()?'#':stack.pop())!='('){
                       charArray[i]=' ';
                    }

                } else {
                    if(charArray[i]=='('){
                       stack.push(charArray[i]);  
                    } 

                }
            } 
      
       int stackSize = stack.size(); 
          
        for(int i=charArray.length-1;i>=0;i--){
            if(stackSize<1)
                break;
            if(charArray[i]=='('){
               charArray[i]=' '; 
                stackSize--;
            }
        }
        return String.valueOf(charArray).replaceAll("\\s", "");

    }
}