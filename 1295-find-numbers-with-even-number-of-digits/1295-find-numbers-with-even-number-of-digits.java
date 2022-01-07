class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            int temp=1;
            while(k/10>=1){
                k=k/10;
                temp++;
            }
            if(temp%2==0){
                count++;
            }
        }
        return count;
        
    }
}