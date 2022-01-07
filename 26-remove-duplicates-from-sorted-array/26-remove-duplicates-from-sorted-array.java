class Solution {
    
    /**
    * Its a two pointer pattern. we initilize nonDuplicate to 1; and for every iteration we check nonDuplicate-1 != present element in array .
    * If they are not equal we will assign nums[nonDuplicate]= present element in the array and increment nonDuplicate..
    * nonDuplicate index is the index where all the values from the starting index  to nonDplicate are not repeated values
    */
    public int removeDuplicates(int[] nums) {
       int nonDuplicate = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[nonDuplicate - 1] != nums[i]) {
                nums[nonDuplicate] = nums[i];
                nonDuplicate++;
            }
        }

        return nonDuplicate;
    }
}