class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> sets = new ArrayList<>();
        Queue<List<Integer>> perm = new LinkedList<>();
        //Add Empty List
        perm.add(new LinkedList<Integer>());
        for(int num : nums){
            //get the count
            int count= perm.size();
            for(int i=0;i<count;i++){
                //Poll the top Element from Queue
                List<Integer> lst = perm.poll();
                //Iterate the list
                for(int j=0;j<=lst.size();j++){
                    // For Each poll with lstSize add num at different index.
                    List<Integer> newPerm = new ArrayList<Integer>(lst);
                    newPerm.add(j,num);
                    if(newPerm.size() == nums.length){
                        sets.add(newPerm);
                    } else {
                        perm.add(newPerm);
                    }
                    
                }

            }
        }
        
        return sets;
    }
}