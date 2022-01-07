class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalList = new ArrayList<List<Integer>>();
        List<Integer> prevList = new ArrayList<>();
        for(int row=0;row<numRows;row++){
           
            int col=0;
            List<Integer> currList = new ArrayList<>();
            while(col<=row){
                if(col==0 || col== row){
                    currList.add(1);
                } else {
                    currList.add(prevList.get(col-1)+prevList.get(col));
                }
                col++;
            }
            pascalList.add(currList);
            prevList=currList;
            
        }
        return pascalList;
    }
    
    
}