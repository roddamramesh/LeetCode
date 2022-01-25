class Solution {
     String[] digitMapping = new String[]{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        if(digits.length()==0)
            return new ArrayList<String>();
     return  findCombinations(digits);
     
    }
    
    public List<String> findCombinations(String digits){
        
        if(digits.length()==0){
            List<String> baseCase = new ArrayList<String>();
            baseCase.add("");
            return baseCase;
        }
        
        char ch = digits.charAt(0);
        String rem = digits.substring(1);
        List<String> baseCombinations = findCombinations(rem);
        List<String> resOfAllCombinations= new ArrayList<>();
        
        String digitChars = digitMapping[ch - '0'];
        for(char c: digitChars.toCharArray()){
            for(int i=0;i<baseCombinations.size();i++){
                
               resOfAllCombinations.add(c+baseCombinations.get(i)); 
            }
        }
        
        return resOfAllCombinations;
       
    }
}