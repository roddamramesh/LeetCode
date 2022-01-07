class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        
        Map<Integer,Integer> pairable = new HashMap<>();
        int numPairs=0;
        for(int i=0;i<time.length;i++){
            int rem = time[i]%60;
            // if we have something like [60,60,60]
            if(rem==0){
               numPairs +=  pairable.getOrDefault(0, 0); 
            }else {
                // [30,20,150,100,40] using this example 100
                numPairs += pairable.getOrDefault(60-rem,0);
                 // if we take moduls of 100 with 60 we get 40, then we look for 60 - 40 which is 20. And 20 is there in "map", we update our count. And update the entry of 40 in our "map" as well
        
            } 
            pairable.put(rem,pairable.getOrDefault(rem,0)+1); 
         // 150 % 60 gives 30 and as we have already encountered 1 of the 30 previously. SO, we will update our count from 0 to 1
            
            
        }
        
       return numPairs; 
    }
}