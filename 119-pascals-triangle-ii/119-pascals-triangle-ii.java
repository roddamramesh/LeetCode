class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> lst = new ArrayList<Integer>();
        List<Integer> prevList = new ArrayList<>();
        
        
        for(int row=0;row<rowIndex+1;row++){
            List<Integer> currList = new ArrayList<>();
            int col=0;
            while(col<=prevList.size()){
                if(col==0||col == prevList.size()){
                    currList.add(1);
                } else {
                    currList.add(col,prevList.get(col-1)+prevList.get(col));
                }
                col++;
            }
            prevList = new ArrayList<>(currList);
        }
        return prevList;
    }
}