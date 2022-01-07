class Solution {
    public List<String> letterCasePermutation(String S) {
        
        List<String> perm = new ArrayList<>();
        perm.add(S);
        for(int i=0;i<S.length();i++){
            if(Character.isAlphabetic(S.charAt(i))){
                int count = perm.size();
                for(int j=0;j<count;j++){
                    char[] chars = perm.get(j).toCharArray();
                    if(Character.isUpperCase(chars[i])){
                         chars[i] = Character.toLowerCase(chars[i]); 
                    } else{
                        chars[i] = Character.toUpperCase(chars[i]);  
                    }
                  
                    perm.add(String.valueOf(chars));  
                }

            }
            
        }
        return perm;
    }
}