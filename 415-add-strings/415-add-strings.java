class Solution {
    public String addStrings(String num1, String num2) {
        
        
        
        StringBuilder res = new StringBuilder();
        int carry = 0;
        
        int num1len = num1.length()-1;
        int num2len = num2.length()-1;
        
        while(num1len>=0 || num2len>=0){
            int n1 = num1len>=0 ?num1.charAt(num1len) - '0' : 0;
            int n2 = num2len>=0 ?num2.charAt(num2len) - '0' : 0;
            int val = (n1 + n2 + carry) % 10;
            carry = (n1+n2+carry)/10;
            res.append(val);
            num1len--;
            num2len--;
            
        }
        if(carry>0){
            res.append(carry);
        }
        
        return res.reverse().toString();
        
    }
}