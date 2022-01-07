class Solution {
    public int longestOnes(int[] A, int K) {
        
        Map<Integer, Integer> hm = new HashMap<>();
        int maxOneCount=0;
        int longestArray=0;
        int ws=0;
        // Take max count of 1 always and check withe difference of window end - window start
        // and remove the count of maxonecount you will get difference number if it is greater           //then k then remove the value at location window start and remove from hashmap and             //increment windowstart
        for(int i=0;i<A.length;i++){
            int rightVal= A[i];
            hm.put(rightVal,hm.getOrDefault(rightVal,0)+1);
            maxOneCount= Math.max(maxOneCount,hm.getOrDefault(1,0));
            
            if(i-ws+1-maxOneCount>K){
                int leftVal= A[ws];
                 hm.put(leftVal,hm.getOrDefault(leftVal,0)-1);
                ws++;
            }
            
            
            longestArray= Math.max(longestArray,i-ws+1);
        }
        return longestArray;
    }
}