class Solution {
    public int numWays(int n, int k) {
        
        if(n==1){
            return k;
        } 
        if(n==2){
            return k*k;
        }
        int same = k*1;
        int different = k*(k-1);
        int total = same + different;
        
        for(int i=3;i<=n;i++){
           same = different*1;
           different = total *(k-1);
            total = same + different;
        }
        
        return total;
    }
}