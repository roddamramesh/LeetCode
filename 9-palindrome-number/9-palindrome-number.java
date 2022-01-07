class Solution {
    
    // Reverse a number and check;
    // If X<0 or  (x!=0 && x%10==0) it is not palindrome
    public boolean isPalindrome(int x) {
        int temp=x;
        if(x<0 || (x!=0 && x%10==0))
            return false;
        
        int rev=0;
        while(x!=0)
        {
            rev=rev*10+(x%10);
             x=x/10;
        }
       
        
        return (rev==temp)?true:false;
    }
}