class Solution {
    public int totalFruit(int[] nums) {
        
        int ws=0;
        int maxFruits=0;
        Map<Integer,Integer> hm= new HashMap<>();
        for(int we=0;we<nums.length;we++){
           hm.put(nums[we],hm.getOrDefault(nums[we],0)+1);
            while(hm.size()>2){
                hm.put(nums[ws],hm.get(nums[ws])-1);
                if(hm.get(nums[ws])==0){
                    hm.remove(nums[ws]);
                } 
                ws++;
            } 
            maxFruits= Math.max(maxFruits,we-ws+1);
           
        }
        if(ws-nums.length>maxFruits)
            maxFruits = ws-nums.length;
        return maxFruits;
    }
}